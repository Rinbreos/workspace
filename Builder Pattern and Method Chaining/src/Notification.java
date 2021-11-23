
public class Notification {
	
	private String contentTitle;
	private String contentText;
	private int smallIcon;
	private Object action;
	
		
	public Notification(String contentTitle, String contentText, int smallIcon, Object action) {
		this.contentTitle = contentTitle;
		this.contentText = contentText;
		this.smallIcon = smallIcon;
		this.action = action;
	}
	
	@Override
	public String toString(){
		return String.format("title: %s text: %s icon: %d action: %s", this.contentTitle, this.contentText, this.smallIcon, this.action);
	}


	public static class Builder{
		
		private String bContentTitle;
		private String bContentText;
		private int bSmallIcon;
		private Object bAction;
		
		public Builder setContentTitle(String title){
			this.bContentTitle = title;
			return this;
		}
		
		public Builder setContentText(String text){
			this.bContentText = text;
			return this;
			
		}
		
		public Builder setSmallIcon(int resourceId){
			this.bSmallIcon = resourceId;
			return this;
		}
		
		public Builder addAction(int resoureId, String label /*,Intent intent*/){
			this.bAction = new Object();
			return this;
		}
		
		
		public Notification build(){
			return new Notification(this.bContentTitle, this.bContentTitle, this.bSmallIcon, this.bAction);
		}
	}

}
