

public class Test {

    // class for testing implementation

    public static void main(String[] args){
        Asset testasset  = new Asset("Test","asset for testing","test","jerry",0.0,"for all");
        Asset testasset1  = new Asset("Test","asset for testing","test","jerry",0.0,"for all");

        AssetManager testManager = new AssetManager();

        testManager.addAsset(testasset);
        testManager.addAsset(testasset1);

        System.out.println(testManager.AssetList.size());

        testManager.searchAssetbykeyword("test");
        testManager.searchAssetbykeyword("bla");






    }
}
