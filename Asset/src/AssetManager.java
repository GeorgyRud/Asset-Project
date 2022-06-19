import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AssetManager {
    //asset list with all assets
    LinkedList<Asset> AssetList = new LinkedList<Asset>();

    // first function to addAsset


    public void editAsset(){

    }


    public void addAsset(Asset asset) {
        if (asset != null) {
            AssetList.add(asset);
        }
    }

    //function to find Assetbyname

    public LinkedList<Asset> searchAssetbyname(String name) {
        LinkedList<Asset> searchResult = new LinkedList<Asset>();

        for (Iterator<Asset> it = AssetList.iterator(); it.hasNext(); ) {
            Asset a = it.next();
            if (a.name.contains(name)) {
                searchResult.add(a);
            }
        }
        if (searchResult.size() == 0) {
            System.out.println("No assets fund");
        }
        return searchResult;
    }


    //first function to find a list of assets for given keywords

    public LinkedList<Asset> searchAssetbykeyword(String keyword) {
        LinkedList<Asset> searchResult = new LinkedList<Asset>();

        for (Iterator<Asset> it = AssetList.iterator(); it.hasNext(); ) {
            Asset a = it.next();
            if (a.keywords.contains(keyword)) {
                searchResult.add(a);
            }
        }
        if (searchResult.size() == 0) {
            System.out.println("No assets fund");
        }
        return searchResult;
    }


    // function to delete assets

    public void deleteAsset(int id, LinkedList<Asset> assetList) {
        for (Iterator<Asset> it = AssetList.iterator(); it.hasNext(); ) {
            Asset a = it.next();
            if (a.index == id) {
                AssetList.remove(id);
            }
        }
    }
}