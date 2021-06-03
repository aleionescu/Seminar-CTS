package ro.ase.cts.tests.mocks;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;

import ro.ase.cts.tests.*;
import ro.ase.cts.tests.categorii.GetPromovabilitateCategory;

@RunWith(Categories.class)
@Suite.SuiteClasses({TestGrupaMock.class, TestGrupa.class,TestGrupaSeparat.class})
@Categories.IncludeCategory(GetPromovabilitateCategory.class)
@Categories.ExcludeCategory(TesteUrgenteCategory.class)

public class SuitaCustom {

}
