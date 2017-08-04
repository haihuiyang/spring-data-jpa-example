package com.yhh.spring.data.jpa.example.converter;

import org.springframework.util.ObjectUtils;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.sql.Date;
import java.time.LocalDate;

@Converter(autoApply = true)
public class LocalDatePersistenceConverter implements AttributeConverter<LocalDate, Date> {
    @Override
    public Date convertToDatabaseColumn(LocalDate localDate) {
        if (ObjectUtils.isEmpty(localDate)) {
            return null;
        }
        return Date.valueOf(localDate);
    }

    @Override
    public LocalDate convertToEntityAttribute(Date databaseValue) {
        if (ObjectUtils.isEmpty(databaseValue)) {
            return null;
        }
        return databaseValue.toLocalDate();
    }
}
