package com.headcode.ourgroceries.android;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class U {

    /* renamed from: c, reason: collision with root package name */
    public static final U f34527c = new U(null, Collections.emptyList());

    /* renamed from: a, reason: collision with root package name */
    private final String f34528a;

    /* renamed from: b, reason: collision with root package name */
    private final List f34529b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f34530a;

        /* renamed from: b, reason: collision with root package name */
        private final String f34531b;

        public a(String str, String str2) {
            this.f34530a = str;
            this.f34531b = str2;
        }

        public String a() {
            return this.f34531b;
        }

        public String b() {
            return this.f34530a;
        }

        public String toString() {
            return "PossibleCategory{mName='" + this.f34530a + "', mId='" + this.f34531b + "'}";
        }
    }

    public U(String str, List list) {
        this.f34528a = str;
        this.f34529b = list;
    }

    public List a() {
        return this.f34529b;
    }

    public String b() {
        return this.f34528a;
    }

    public String toString() {
        return "CategorySuggestion{mSuggestedCategoryId='" + this.f34528a + "', mPossibleCategories=" + this.f34529b + '}';
    }
}
