package StructuralDP.CompositeDP;

import java.util.List;

abstract class Department {

    abstract String getName();

    // butun departmanlarda calisanlari getirecek metod
    abstract List<String> getEmployees();

}
