package tranpack.core;

import javax.jcr.Node;

import com.adobe.cq.sightly.WCMUsePojo;

public class EmpDetailsComponent extends WCMUsePojo 
{
	private EmpDetailsBean empDetailsBean= null;

	@Override
	public void activate() throws Exception 
	{
		// TODO Auto-generated method stub
		Node currentNode = getResource().adaptTo(Node.class);
		
		empDetailsBean = new EmpDetailsBean();
		
		if(currentNode.hasProperty("image")) {
			empDetailsBean.setImage(currentNode.getProperty("image").getString());
		}
		
		if(currentNode.hasProperty("name")) {
			empDetailsBean.setName(currentNode.getProperty("name").getString());
		}
		
		if(currentNode.hasProperty("organization")) {
			empDetailsBean.setOrganization(currentNode.getProperty("organization").getString());
		}
		
		if(currentNode.hasProperty("address")) {
			empDetailsBean.setAddress(currentNode.getProperty("address").getString());
		}
		
		if(currentNode.hasProperty("phone")) {
			empDetailsBean.setPhone(currentNode.getProperty("phone").getString());
		}
		
	}
	public EmpDetailsBean getEmpDetailsBean() {
		return this.empDetailsBean;
		}
}