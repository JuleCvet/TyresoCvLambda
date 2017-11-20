
package tyresocvlambda;
import java.util.*;

public class MyCv implements GolCv,CvOperations {
	private Person person;
	private List<SectionNameType> sectionList = Arrays.asList(SectionNameType.values());
	private StringBuilder myCv;
	
	public MyCv(Person person) {
		this.person = person;
		myCv = new StringBuilder(
			sectionList.get(0)+":\n"+sectionList.get(1)+":\n"+sectionList.get(2)+":\n"
			+sectionList.get(3)+":\n"+sectionList.get(4)+":\n"+sectionList.get(5)+":\n");
	}

	@Override
	public void insertGoal(String mygoal) {
		myCv.insert(findIndexAfterSectionName(SectionNameType.MALSATNING), mygoal);
	}

	@Override
	public void ReplaceMyGoal(String newMyGoal) {
		changeSectionBody(SectionNameType.MALSATNING, newMyGoal);
	}
	
	@Override
	public int findIndexAfterSectionName(SectionNameType section) {
		return myCv.indexOf(section.name())+section.name().length()+1;
	}
	
	@Override
	public SectionNameType nextSectionName(SectionNameType sectionName) {
		Iterator<SectionNameType> itr = sectionList.iterator();
		while(itr.hasNext()) {
			SectionNameType temp = itr.next();
			if(temp.equals(sectionName) &&itr.hasNext())
				return itr.next();
		}
		return null;
	}
	
	@Override
	public void deleteSectionBody(SectionNameType sectionName) {	
		myCv.replace(findIndexAfterSectionName(sectionName),(nextSectionName(sectionName)!=null)
                  ?myCv.indexOf(nextSectionName(sectionName).name()):myCv.length(),"\n");
	}
	
	@Override
	public void changeSectionBody(SectionNameType sectionName,String newString) {	
		deleteSectionBody(sectionName);
		insertGoal(newString);
	}

	@Override
	public void printCv() {
		System.out.println(myCv);
    }
}



