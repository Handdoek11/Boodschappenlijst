package com.adadapted.android.sdk.core.keyword;

import H.AbstractC0626b;
import J6.AbstractC0650j;
import J6.r;
import g7.b;
import g7.g;
import i7.f;
import j7.d;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import k7.C0;
import k7.C6125f;
import y6.AbstractC6987o;

@g
/* loaded from: classes.dex */
public final class Intercept {
    private static final int MIN_MATCH_LENGTH = 3;
    private static final long REFRESH_TIME = 300;
    private static final String SEARCH_ID = "empty";
    private final int minMatchLength;
    private final long refreshTime;
    private final String searchId;
    private final List<Term> terms;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final b[] $childSerializers = {null, null, null, new C6125f(Term$$serializer.INSTANCE)};

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC0650j abstractC0650j) {
            this();
        }

        public final b serializer() {
            return Intercept$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Intercept() {
        this((String) null, 0L, 0, (List) null, 15, (AbstractC0650j) null);
    }

    private final List<Term> component4() {
        return this.terms;
    }

    public static /* synthetic */ Intercept copy$default(Intercept intercept, String str, long j8, int i8, List list, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = intercept.searchId;
        }
        if ((i9 & 2) != 0) {
            j8 = intercept.refreshTime;
        }
        long j9 = j8;
        if ((i9 & 4) != 0) {
            i8 = intercept.minMatchLength;
        }
        int i10 = i8;
        if ((i9 & 8) != 0) {
            list = intercept.terms;
        }
        return intercept.copy(str, j9, i10, list);
    }

    public static /* synthetic */ void getMinMatchLength$annotations() {
    }

    public static /* synthetic */ void getRefreshTime$annotations() {
    }

    public static /* synthetic */ void getSearchId$annotations() {
    }

    public static final /* synthetic */ void write$Self$advertising_sdk_release(Intercept intercept, d dVar, f fVar) {
        b[] bVarArr = $childSerializers;
        if (dVar.e(fVar, 0) || !r.a(intercept.searchId, SEARCH_ID)) {
            dVar.g(fVar, 0, intercept.searchId);
        }
        if (dVar.e(fVar, 1) || intercept.refreshTime != REFRESH_TIME) {
            dVar.u(fVar, 1, intercept.refreshTime);
        }
        if (dVar.e(fVar, 2) || intercept.minMatchLength != 3) {
            dVar.h(fVar, 2, intercept.minMatchLength);
        }
        if (!dVar.e(fVar, 3) && r.a(intercept.terms, new ArrayList())) {
            return;
        }
        dVar.p(fVar, 3, bVarArr[3], intercept.terms);
    }

    public final String component1() {
        return this.searchId;
    }

    public final long component2() {
        return this.refreshTime;
    }

    public final int component3() {
        return this.minMatchLength;
    }

    public final Intercept copy(String str, long j8, int i8, List<Term> list) {
        r.e(str, "searchId");
        r.e(list, "terms");
        return new Intercept(str, j8, i8, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Intercept)) {
            return false;
        }
        Intercept intercept = (Intercept) obj;
        return r.a(this.searchId, intercept.searchId) && this.refreshTime == intercept.refreshTime && this.minMatchLength == intercept.minMatchLength && r.a(this.terms, intercept.terms);
    }

    public final int getMinMatchLength() {
        return this.minMatchLength;
    }

    public final long getRefreshTime() {
        return this.refreshTime;
    }

    public final String getSearchId() {
        return this.searchId;
    }

    public final List<Term> getTerms() {
        return AbstractC6987o.U(this.terms, new Comparator() { // from class: com.adadapted.android.sdk.core.keyword.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Term) obj).compareTo((Term) obj2);
            }
        });
    }

    public int hashCode() {
        return (((((this.searchId.hashCode() * 31) + AbstractC0626b.a(this.refreshTime)) * 31) + this.minMatchLength) * 31) + this.terms.hashCode();
    }

    public String toString() {
        return "Intercept(searchId=" + this.searchId + ", refreshTime=" + this.refreshTime + ", minMatchLength=" + this.minMatchLength + ", terms=" + this.terms + ")";
    }

    public /* synthetic */ Intercept(int i8, String str, long j8, int i9, List list, C0 c02) {
        this.searchId = (i8 & 1) == 0 ? SEARCH_ID : str;
        if ((i8 & 2) == 0) {
            this.refreshTime = REFRESH_TIME;
        } else {
            this.refreshTime = j8;
        }
        if ((i8 & 4) == 0) {
            this.minMatchLength = 3;
        } else {
            this.minMatchLength = i9;
        }
        if ((i8 & 8) == 0) {
            this.terms = new ArrayList();
        } else {
            this.terms = list;
        }
    }

    public Intercept(String str, long j8, int i8, List<Term> list) {
        r.e(str, "searchId");
        r.e(list, "terms");
        this.searchId = str;
        this.refreshTime = j8;
        this.minMatchLength = i8;
        this.terms = list;
    }

    public /* synthetic */ Intercept(String str, long j8, int i8, List list, int i9, AbstractC0650j abstractC0650j) {
        this((i9 & 1) != 0 ? SEARCH_ID : str, (i9 & 2) != 0 ? REFRESH_TIME : j8, (i9 & 4) != 0 ? 3 : i8, (i9 & 8) != 0 ? new ArrayList() : list);
    }
}
