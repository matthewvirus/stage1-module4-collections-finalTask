package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {

    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> developerProjects = new ArrayList<>();
        projects.forEach((k, v) -> {
            if (v.contains(developer))
                developerProjects.add(k);
        });
        developerProjects.sort(new ProjectsComparator());
        return developerProjects;
    }
}

class ProjectsComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() == o2.length()) {
            return -o1.compareTo(o2);
        }
        return o1.length() > o2.length() ? -1 : 1;
    }
}