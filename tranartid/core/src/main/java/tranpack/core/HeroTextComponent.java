package tranpack.core;

import javax.jcr.Node;

import com.adobe.cq.sightly.WCMUsePojo;

public class HeroTextComponent extends WCMUsePojo{
private HeroTextBean heroTextBean = null; 
	@Override
	public void activate() throws Exception {
		// TODO Auto-generated method stub
	Node currentNode = getResource().adaptTo(Node.class);
	heroTextBean = new HeroTextBean();
	if(currentNode.hasProperty("heading"))
	{
		heroTextBean.setHeadingText(currentNode.getProperty("heading").getString());
	}
	if(currentNode.hasProperty("description")){
		heroTextBean.setDescription(currentNode.getProperty("description").getString());
	}
	}
	public HeroTextBean getHeroTextBean() {
	return this.heroTextBean;
	}
	}


