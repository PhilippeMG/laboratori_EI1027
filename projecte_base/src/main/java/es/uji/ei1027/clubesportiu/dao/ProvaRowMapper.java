package es.uji.ei1027.clubesportiu.dao;


import es.uji.ei1027.clubesportiu.model.Prova;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public final class ProvaRowMapper implements RowMapper<Prova> {
    public Prova mapRow(ResultSet rs, int rowNum) throws SQLException {
        Prova prova = new Prova();
        prova.setNom(rs.getString("nom"));
        prova.setDescripcion(rs.getString("descripcio"));
        prova.setTipo(rs.getString("tipus"));
        prova.setDate(rs.getDate("data").toLocalDate());
        return prova;
    }
}

