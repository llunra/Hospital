package com.oracle.service;

import com.oracle.mapper.ConsultationMapper;
import com.oracle.mapper.PatientsMapper;
import com.oracle.pojo.Patients;
import com.oracle.utils.DBUtils;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.ibatis.session.SqlSession;

public class PatientServiceimpl implements PatientService {

    @Override
    public Patients selectPatientByName(String name) {
        SqlSession sqlSession= DBUtils.createDbUtils().getSQLSession();
        PatientsMapper patientsMapper = sqlSession.getMapper(PatientsMapper.class);
        Patients patients=patientsMapper.selectPatientsByName(name);
        sqlSession.close();
        return patients;
    }

    public boolean login(Patients patients) {
        SqlSession sqlSession= DBUtils.createDbUtils().getSQLSession();
        PatientsMapper patientsMapper=sqlSession.getMapper(PatientsMapper.class);
        sqlSession.close();
        return true;
    }

    @Override
    public Integer getCurrentMaxPatientId() {
        SqlSession sqlSession= DBUtils.createDbUtils().getSQLSession();
        PatientsMapper patientsMapper=sqlSession.getMapper(PatientsMapper.class);
        String strMaxPatientId=patientsMapper.selectMaxPatientId();
        Integer iMaxPatientId=Integer.parseInt(strMaxPatientId);
        sqlSession.close();
        return iMaxPatientId;
    }


}
