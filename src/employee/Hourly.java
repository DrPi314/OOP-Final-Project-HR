package employee;


public class Hourly {
	protected double totalHoursOfWork;
	public boolean Volunteer;

	public Hourly(double totalHourOfWorks, boolean volunteer) {
		this.totalHoursOfWork = totalHourOfWorks;
		this.Volunteer = volunteer;
	}
	
	// constructor for salary
	public Hourly() {
		
		
		
	}
	

	public boolean isFullTime() {
		if (totalHoursOfWork >= 40 && !(Volunteer)) {
			return true;
		}
		return false;
	}

	public boolean isPartTime() {
		if (totalHoursOfWork < 40 && !(Volunteer)) {
			return true;
		}
		return false;
	}

	public boolean IsVolunter() {
		if (!(isFullTime()) && !(isPartTime())) {
			return true;
		}
		return false;
	}public double getTotalHoursOfWork() {
		return totalHoursOfWork;
	}

	public void setTotalHoursOfWork(double totalHoursOfWork) {
		this.totalHoursOfWork = totalHoursOfWork;
	}

	public boolean isVolunteer() {
		return Volunteer;
	}

	public void setVolunteer(boolean volunteer) {
		Volunteer = volunteer;
	}

	@Override
	public String toString() {
		return "Hourly [totalHoursOfWork=" + totalHoursOfWork + ", Volunteer=" + Volunteer + "]";
	}


}

