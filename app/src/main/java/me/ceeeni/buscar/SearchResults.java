package me.ceeeni.buscar;

/**
 * Created by sreen on 6/25/2017.
 */

import com.google.gson.annotations.SerializedName;

// twitter search results
public class SearchResults {

    @SerializedName("statuses")
    private Searches statuses;

    @SerializedName("search_metadata")
    private SearchMetadata metadata;


    public Searches getStatuses() {
        return statuses;
    }

    public void setStatuses(Searches statuses) {
        this.statuses = statuses;
    }

    public SearchMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(SearchMetadata metadata) {
        this.metadata = metadata;
    }
}