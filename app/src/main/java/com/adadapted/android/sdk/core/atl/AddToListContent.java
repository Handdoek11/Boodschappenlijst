package com.adadapted.android.sdk.core.atl;

import java.util.List;

/* loaded from: classes.dex */
public interface AddToListContent {

    public static final class Sources {
        public static final int $stable = 0;
        public static final Sources INSTANCE = new Sources();
        public static final String IN_APP = "in_app";
        public static final String OUT_OF_APP = "out_of_app";

        private Sources() {
        }
    }

    void acknowledge();

    void failed(String str);

    List<AddToListItem> getItems();

    String getSource();

    boolean hasNoItems();

    void itemAcknowledge(AddToListItem addToListItem);

    void itemFailed(AddToListItem addToListItem, String str);
}
