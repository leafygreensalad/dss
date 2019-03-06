package eu.europa.esig.dss.jaxb.validationreport;

import static org.junit.Assert.assertNotNull;

import javax.xml.bind.JAXBContext;
import javax.xml.validation.Schema;

import org.junit.Test;

public class ValidationReportUtilsTest {

	@Test
	public void getJAXBContext() {
		JAXBContext jaxbContext = ValidationReportUtils.getJAXBContext();
		assertNotNull(jaxbContext);
		assertNotNull(ValidationReportUtils.getJAXBContext());
	}

	@Test
	public void getSchema() {
		Schema schema = ValidationReportUtils.getSchema();
		assertNotNull(schema);
		assertNotNull(ValidationReportUtils.getSchema());
	}

}
