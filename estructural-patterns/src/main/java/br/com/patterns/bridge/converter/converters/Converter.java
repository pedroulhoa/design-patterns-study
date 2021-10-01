package br.com.patterns.bridge.converter.converters;

import br.com.patterns.bridge.converter.employees.Employee;

public interface Converter {
    String getEmployeeFormated(Employee emp);
}
