package assignment1;


public class SkyAirlines {


		private String Name ,Source,Distination;
	
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			this.Name=name;
		}
		public String getSource() {
			return Source;
		}
		public void setSource(String source) {
			this.Source=source;
		}
		public String getDistination() {
			return Distination;
		}
		public void setDistination(String distination) {
			this.Distination=distination;
		}
		@Override
		public String toString() {
			return "Dear "+Name+","+ "welcome onboard with the service from "+Source+ " to "+Distination+ ". "+ " Thank you for choosing Sky Airlines. Enjoy your flight .";
		}
		}
		
		
		

	

