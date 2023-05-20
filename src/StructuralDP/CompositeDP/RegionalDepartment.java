package StructuralDP.CompositeDP;

import java.util.List;
import java.util.stream.Collectors;

public class RegionalDepartment extends Department{

    // butun departmanlari bir degisken uzerinde kontrol etmek icin olusturuldu
    List<Department> childDepartments;

    // parametreli const.
    public RegionalDepartment(List<Department> childDepartments) {
        this.childDepartments = childDepartments;
    }

    @Override
    String getName() { // firmada olan butun departmanlarin isimlerini getirsin
        return childDepartments.stream(). // stream yapida departmanlar geliyor
                map(Department::getName). // stream departman isimleri geliyor
                collect(Collectors.joining(", ")); // "Finance, Sales"
    }

    @Override
    List<String> getEmployees() { // firmada butun calisanlarin isimleri
        return childDepartments.stream().
                flatMap(d->d.getEmployees().stream()).
                collect(Collectors.toList());
    }
}
