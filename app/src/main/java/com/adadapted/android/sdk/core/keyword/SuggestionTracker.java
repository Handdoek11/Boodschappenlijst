package com.adadapted.android.sdk.core.keyword;

import J6.r;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class SuggestionTracker {
    public static final SuggestionTracker INSTANCE = new SuggestionTracker();
    private static final Map<String, String> items = new HashMap();
    private static final Map<String, String> replacements = new HashMap();
    public static final int $stable = 8;

    private SuggestionTracker() {
    }

    private final String convertToLowerCase(String str) {
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            r.d(lowerCase, "toLowerCase(...)");
            if (lowerCase != null) {
                return lowerCase;
            }
        }
        return "";
    }

    public final synchronized void suggestionMatched(String str, String str2, String str3, String str4, String str5) {
        r.e(str, "searchId");
        r.e(str2, "termId");
        r.e(str3, "term");
        r.e(str4, "replacement");
        r.e(str5, "userInput");
        String convertToLowerCase = convertToLowerCase(str3);
        String convertToLowerCase2 = convertToLowerCase(str5);
        String convertToLowerCase3 = convertToLowerCase(str4);
        items.put(convertToLowerCase, convertToLowerCase2);
        replacements.put(convertToLowerCase3, convertToLowerCase);
        InterceptClient.Companion.getInstance().trackMatched(str, str2, convertToLowerCase, convertToLowerCase2);
    }

    public final synchronized void suggestionNotMatched(String str, String str2) {
        r.e(str, "searchId");
        r.e(str2, "userInput");
        InterceptClient.Companion.getInstance().trackNotMatched(str, convertToLowerCase(str2));
    }

    public final synchronized void suggestionPresented(String str, String str2, String str3) {
        try {
            r.e(str, "searchId");
            r.e(str2, "termId");
            r.e(str3, "replacement");
            String convertToLowerCase = convertToLowerCase(str3);
            Map<String, String> map = replacements;
            if (map.containsKey(convertToLowerCase)) {
                String str4 = map.get(convertToLowerCase);
                String str5 = items.get(str4);
                InterceptClient companion = InterceptClient.Companion.getInstance();
                if (str4 == null) {
                    str4 = "";
                }
                if (str5 == null) {
                    str5 = "";
                }
                companion.trackPresented(str, str2, str4, str5);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void suggestionSelected(String str, String str2, String str3) {
        try {
            r.e(str, "searchId");
            r.e(str2, "termId");
            r.e(str3, "replacement");
            String convertToLowerCase = convertToLowerCase(str3);
            Map<String, String> map = replacements;
            if (map.containsKey(convertToLowerCase)) {
                String str4 = map.get(convertToLowerCase);
                String str5 = items.get(str4);
                InterceptClient companion = InterceptClient.Companion.getInstance();
                if (str4 == null) {
                    str4 = "";
                }
                if (str5 == null) {
                    str5 = "";
                }
                companion.trackSelected(str, str2, str4, str5);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
