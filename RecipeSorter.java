
import java.util.*;

class RecipeSorter {
	public static void main(String[] args) {
		
		// make Recipes
		ArrayList<String> momRecipes = new ArrayList<String>(120);
		ArrayList<String> dadRecipes = new ArrayList<String>(120);
		ArrayList<String> boyRecipes = new ArrayList<String>(120);
		momRecipes.add("\nA1 CURRY CHICKEN");
		momRecipes.add("\nSPAGHETTI AGLIO-OLIO");
		momRecipes.add("\nBI BIM BAP+");
		momRecipes.add("\nKANG KONG");
		momRecipes.add("\nONION FRIED EGG");
		momRecipes.add("\nTUMERIC FRIED FISH");
		momRecipes.add("\nBEAN SPROUT");
		momRecipes.add("\nBEAN PASTE SOUP");
		momRecipes.add("\nBEEF WITH SNAP PEAS");
		momRecipes.add("\nKARI PUFF");
		momRecipes.add("\nGARLIC VEG W/ SOY & SESAME OIL");
		momRecipes.add("\nSTEAM EGG W/ SOY, FRIED O");
		momRecipes.add("\nKETCHUP POTATO");
		momRecipes.add("\nKIMCHI SOUP");
		momRecipes.add("\nFRIED/BAKED CROAKER");
		momRecipes.add("\nFRIED/BAKED MACKEREL");
		momRecipes.add("\nGO CHU JANG CUCUMBER KIMCHI");
		momRecipes.add("\nCUCUMBER KIMCHI");
		momRecipes.add("\nBLACK BEAN BEEF");
		momRecipes.add("\nGLASS NOODLE");
		momRecipes.add("\nHOT-POT / STEAM BOAT");
		momRecipes.add("\nGREEN BEAN W/ MINCED CHICKEN");
		momRecipes.add("\nPOTATO WEDGE, BAKED");
		momRecipes.add("\nASPARAGUS");
		momRecipes.add("\nBOILED TOFU W/ KOREAN SAUCE");
		momRecipes.add("\nKIMCHI FRIED RICE");
		momRecipes.add("\nKIDS FRIED RICE W/ CORN");
		momRecipes.add("\nGREEK BUTTER LEMON BAKED FISH");
		momRecipes.add("\nMOMMY'S PORRIDGE");
		momRecipes.add("\nSOY SAUCE CHICKEN");
		momRecipes.add("\nBOILED CHICKEN & SOUP");
		momRecipes.add("\nCORN");
		momRecipes.add("\nPEAS");
		momRecipes.add("\nSWEET POTATO");
		momRecipes.add("\nHARD BOILED EGG");
		momRecipes.add("\nMISO SALMON");
		momRecipes.add("\nROAST CHICKEN");
		momRecipes.add("\nCHILI");
		momRecipes.add("\nBURRITO / TACO");
		momRecipes.add("\nJAPANESE CURRY");
		momRecipes.add("\nMALAYSIA CURRY");
		momRecipes.add("\nJAPANESE EGG");
		momRecipes.add("\nBLACK PEPPER UDON");
		momRecipes.add("\nKOREAN SPINACH");
		momRecipes.add("\nTOFU STEW");
		momRecipes.add("\nCHOCOLATE MOUSSE");
		momRecipes.add("\nCAESAR SALAD");
		momRecipes.add("\nSPAGHETTI ARRABIATA");
		momRecipes.add("\nJAPCHAE");
		momRecipes.add("\nTACOS");
		momRecipes.add("\nMAHI LEMON FISH");
		momRecipes.add("\nALOO GOBI");
		
		
		dadRecipes.add("\nCHICKEN ADOBO");
		dadRecipes.add("\nVEG STIR FRY");
		dadRecipes.add("\nGUAM CHICKEN");
		dadRecipes.add("\nMACKEREL");
		dadRecipes.add("\nTUNA SANDWICH");
		dadRecipes.add("\nJAPANESE EGG");
		
		boyRecipes.add("\nBBQ CHICKEN SANDWICH");
		boyRecipes.add("\nEGG OMELET");
		boyRecipes.add("\nJAPANESE EGG");
		
		// sort recipes in alphabetical order
		momRecipes.sort(null);
		dadRecipes.sort(null);
		boyRecipes.sort(null);
		
		// remove the [] in the arraylists
		String momRecipesStr = momRecipes.toString();
		String dadRecipesStr = dadRecipes.toString();
		String boyRecipesStr = boyRecipes.toString();
		momRecipesStr = momRecipesStr.substring(1, momRecipesStr.length() - 1);
		dadRecipesStr = dadRecipesStr.substring(1, dadRecipesStr.length() - 1);
		boyRecipesStr = boyRecipesStr.substring(1, boyRecipesStr.length() - 1);
		
		// print recipes
		System.out.println("\nMommy's Recipes:");
		System.out.println(momRecipesStr + "\n");
		System.out.println("\nDaddy's Recipes:");
		System.out.println(dadRecipesStr + "\n");
		System.out.println("\nJeremiah's Recipes:");
		System.out.println(boyRecipesStr + "\n");
	}
	
	
}
