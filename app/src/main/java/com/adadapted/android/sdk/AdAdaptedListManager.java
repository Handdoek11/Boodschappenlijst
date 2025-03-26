package com.adadapted.android.sdk;

import J6.r;
import com.adadapted.android.sdk.constants.EventStrings;
import com.adadapted.android.sdk.core.event.EventClient;
import com.adadapted.android.sdk.core.log.AALogger;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class AdAdaptedListManager {
    public static final int $stable = 0;
    public static final AdAdaptedListManager INSTANCE = new AdAdaptedListManager();
    private static final String ITEM_NAME = "item_name";
    private static final String LIST_NAME = "list_name";

    private AdAdaptedListManager() {
    }

    private final Map<String, String> generateListParams(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(LIST_NAME, str);
        hashMap.put(ITEM_NAME, str2);
        return hashMap;
    }

    public static /* synthetic */ void itemAddedToList$default(AdAdaptedListManager adAdaptedListManager, String str, String str2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = "";
        }
        adAdaptedListManager.itemAddedToList(str, str2);
    }

    public static /* synthetic */ void itemCrossedOffList$default(AdAdaptedListManager adAdaptedListManager, String str, String str2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = "";
        }
        adAdaptedListManager.itemCrossedOffList(str, str2);
    }

    public static /* synthetic */ void itemDeletedFromList$default(AdAdaptedListManager adAdaptedListManager, String str, String str2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = "";
        }
        adAdaptedListManager.itemDeletedFromList(str, str2);
    }

    public final synchronized void itemAddedToList(String str, String str2) {
        r.e(str, "list");
        r.e(str2, "item");
        if (str2.length() == 0) {
            return;
        }
        EventClient.INSTANCE.trackSdkEvent(EventStrings.USER_ADDED_TO_LIST, generateListParams(str, str2));
        AALogger.INSTANCE.logInfo(str2 + " was added to " + str);
    }

    public final synchronized void itemCrossedOffList(String str, String str2) {
        r.e(str, "list");
        r.e(str2, "item");
        if (str2.length() == 0) {
            return;
        }
        EventClient.INSTANCE.trackSdkEvent(EventStrings.USER_CROSSED_OFF_LIST, generateListParams(str, str2));
        AALogger.INSTANCE.logInfo(str2 + " was crossed off " + str);
    }

    public final synchronized void itemDeletedFromList(String str, String str2) {
        r.e(str, "list");
        r.e(str2, "item");
        if (str2.length() == 0) {
            return;
        }
        EventClient.INSTANCE.trackSdkEvent(EventStrings.USER_DELETED_FROM_LIST, generateListParams(str, str2));
        AALogger.INSTANCE.logInfo(str2 + " was deleted from " + str);
    }
}
