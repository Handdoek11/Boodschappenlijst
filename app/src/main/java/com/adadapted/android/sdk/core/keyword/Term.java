package com.adadapted.android.sdk.core.keyword;

import J6.AbstractC0650j;
import J6.r;
import g7.b;
import g7.g;
import i7.f;
import j7.d;
import k7.AbstractC6149r0;
import k7.C0;

@g
/* loaded from: classes.dex */
public final class Term {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String icon;
    private final int priority;
    private final String replacement;
    private final String searchTerm;
    private final String tagline;
    private final String termId;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC0650j abstractC0650j) {
            this();
        }

        public final b serializer() {
            return Term$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Term(int i8, String str, String str2, String str3, String str4, String str5, int i9, C0 c02) {
        if (63 != (i8 & 63)) {
            AbstractC6149r0.a(i8, 63, Term$$serializer.INSTANCE.getDescriptor());
        }
        this.termId = str;
        this.searchTerm = str2;
        this.replacement = str3;
        this.icon = str4;
        this.tagline = str5;
        this.priority = i9;
    }

    private final int component6() {
        return this.priority;
    }

    public static /* synthetic */ Term copy$default(Term term, String str, String str2, String str3, String str4, String str5, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = term.termId;
        }
        if ((i9 & 2) != 0) {
            str2 = term.searchTerm;
        }
        String str6 = str2;
        if ((i9 & 4) != 0) {
            str3 = term.replacement;
        }
        String str7 = str3;
        if ((i9 & 8) != 0) {
            str4 = term.icon;
        }
        String str8 = str4;
        if ((i9 & 16) != 0) {
            str5 = term.tagline;
        }
        String str9 = str5;
        if ((i9 & 32) != 0) {
            i8 = term.priority;
        }
        return term.copy(str, str6, str7, str8, str9, i8);
    }

    public static /* synthetic */ void getSearchTerm$annotations() {
    }

    public static /* synthetic */ void getTermId$annotations() {
    }

    public static final /* synthetic */ void write$Self$advertising_sdk_release(Term term, d dVar, f fVar) {
        dVar.g(fVar, 0, term.termId);
        dVar.g(fVar, 1, term.searchTerm);
        dVar.g(fVar, 2, term.replacement);
        dVar.g(fVar, 3, term.icon);
        dVar.g(fVar, 4, term.tagline);
        dVar.h(fVar, 5, term.priority);
    }

    public final int compareTo(Term term) {
        r.e(term, "a2");
        int i8 = this.priority;
        int i9 = term.priority;
        return i8 == i9 ? this.searchTerm.compareTo(term.searchTerm) : i8 < i9 ? -1 : 1;
    }

    public final String component1() {
        return this.termId;
    }

    public final String component2() {
        return this.searchTerm;
    }

    public final String component3() {
        return this.replacement;
    }

    public final String component4() {
        return this.icon;
    }

    public final String component5() {
        return this.tagline;
    }

    public final Term copy(String str, String str2, String str3, String str4, String str5, int i8) {
        r.e(str, "termId");
        r.e(str2, "searchTerm");
        r.e(str3, "replacement");
        r.e(str4, "icon");
        r.e(str5, "tagline");
        return new Term(str, str2, str3, str4, str5, i8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Term)) {
            return false;
        }
        Term term = (Term) obj;
        return r.a(this.termId, term.termId) && r.a(this.searchTerm, term.searchTerm) && r.a(this.replacement, term.replacement) && r.a(this.icon, term.icon) && r.a(this.tagline, term.tagline) && this.priority == term.priority;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getReplacement() {
        return this.replacement;
    }

    public final String getSearchTerm() {
        return this.searchTerm;
    }

    public final String getTagline() {
        return this.tagline;
    }

    public final String getTermId() {
        return this.termId;
    }

    public int hashCode() {
        return (((((((((this.termId.hashCode() * 31) + this.searchTerm.hashCode()) * 31) + this.replacement.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.tagline.hashCode()) * 31) + this.priority;
    }

    public String toString() {
        return "Term(termId=" + this.termId + ", searchTerm=" + this.searchTerm + ", replacement=" + this.replacement + ", icon=" + this.icon + ", tagline=" + this.tagline + ", priority=" + this.priority + ")";
    }

    public Term(String str, String str2, String str3, String str4, String str5, int i8) {
        r.e(str, "termId");
        r.e(str2, "searchTerm");
        r.e(str3, "replacement");
        r.e(str4, "icon");
        r.e(str5, "tagline");
        this.termId = str;
        this.searchTerm = str2;
        this.replacement = str3;
        this.icon = str4;
        this.tagline = str5;
        this.priority = i8;
    }
}
