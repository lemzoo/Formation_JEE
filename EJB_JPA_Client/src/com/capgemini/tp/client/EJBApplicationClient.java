package com.capgemini.tp.client;

import java.util.List;

import javax.naming.Context;
import javax.naming.NamingException;

import com.capgemini.tp.entity.Project;
import com.capgemini.tp.implementation.ProjectBean;
import com.capgemini.tp.service.IProject;
import com.capgemini.tp.util.EJBApplicationUtil;

public class EJBApplicationClient {
	public static void main(String[] args) {
		IProject bean = doLookup();
		// 4. Appel du service
		Project p1 = new Project();
		p1.setPname("Banking App");
		p1.setPlocation("Town City");
		p1.setDeptNo(1);

		Project p2 = new Project();
		p2.setPname("Office Automation");
		p2.setPlocation("Downtown");
		p2.setDeptNo(2);

		// 4. Call business logic
		// Saving new Projects
		bean.saveProject(p1);
		bean.saveProject(p2);

		// Find a Project
		p1.setPnumber(1);
		Project p3 = bean.findProject(p1);
		System.out.println(p3);

		// Retrieve all projects
		System.out.println("List of Projects:");
		List<Project> projects = bean.retrieveAllProjects();
		for (Project project : projects)
			System.out.println(project);

	}

	private static IProject doLookup() {
		Context context = null;
		IProject bean = null;
		try {
			// 1. Obtenir le context
			context = EJBApplicationUtil.getInitialContext();
			// 2. Generate JNDI Lookup name
			String lookupName = getLookupName();
			// 3. Lookup and cast
			bean = (IProject) context.lookup(lookupName);

		} catch (NamingException e) {
			e.printStackTrace();
		}
		return bean;
	}

	private static String getLookupName() {
		// nom ear
		String appName = "";

		// nom du jar ejb (nom du projet dans eclipse par défaut)
		String moduleName = "EjbJpa";

		// nom optionnel JBoss7
		String distinctName = "";

		// Nom de la classe implementant le EJB
		String beanName = ProjectBean.class.getSimpleName();

		// Nom complet de l'interface
		final String interfaceName = IProject.class.getName();

		// Create a look up string name
		String name = "ejb:" + appName + "/" + moduleName + "/" + distinctName + "/" + beanName + "!" + interfaceName;

		return name;
	}
}