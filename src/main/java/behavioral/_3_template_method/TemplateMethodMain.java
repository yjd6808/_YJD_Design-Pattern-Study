package behavioral._3_template_method;


import behavioral._3_template_method.recipe.*;

public class TemplateMethodMain {
	public static void main(String[] args) {
		RamenRecipe jungdoRamenRecipe = new JungdoRamenRecipe();
		RamenRecipe hyungdoRamenRecipe = new HyungdoRamenRecipe();

		jungdoRamenRecipe.cookRamen();
		System.out.println("==============");
		hyungdoRamenRecipe.cookRamen();
	}
}
