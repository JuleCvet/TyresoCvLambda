
package tyresocvlambda;

public interface CvOperations {
    
	void deleteSectionBody(SectionNameType sectionName);
	
	void changeSectionBody(SectionNameType sectionName, String newString);

	int findIndexAfterSectionName(SectionNameType section);
	
	SectionNameType nextSectionName(SectionNameType sectionName);

	void printCv();
        
}
