package com.adadapted.android.sdk.core.keyword;

import H.AbstractC0626b;
import J6.AbstractC0650j;
import J6.r;
import S6.h;
import com.adadapted.android.sdk.core.ad.AdActionType;
import g7.b;
import g7.g;
import i7.f;
import j7.d;
import java.util.Date;
import k7.C0;

@g
/* loaded from: classes.dex */
public final class InterceptEvent {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final String MATCHED = "matched";
    public static final String NOT_MATCHED = "not_matched";
    public static final String PRESENTED = "presented";
    public static final String SELECTED = "selected";
    private final long createdAt;
    private final String event;
    private final String searchId;
    private final String term;
    private final String termId;
    private final String userInput;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC0650j abstractC0650j) {
            this();
        }

        public final b serializer() {
            return InterceptEvent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public InterceptEvent() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 0L, 63, (AbstractC0650j) null);
    }

    public static /* synthetic */ InterceptEvent copy$default(InterceptEvent interceptEvent, String str, String str2, String str3, String str4, String str5, long j8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = interceptEvent.searchId;
        }
        if ((i8 & 2) != 0) {
            str2 = interceptEvent.event;
        }
        String str6 = str2;
        if ((i8 & 4) != 0) {
            str3 = interceptEvent.userInput;
        }
        String str7 = str3;
        if ((i8 & 8) != 0) {
            str4 = interceptEvent.termId;
        }
        String str8 = str4;
        if ((i8 & 16) != 0) {
            str5 = interceptEvent.term;
        }
        String str9 = str5;
        if ((i8 & 32) != 0) {
            j8 = interceptEvent.createdAt;
        }
        return interceptEvent.copy(str, str6, str7, str8, str9, j8);
    }

    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    public static /* synthetic */ void getEvent$annotations() {
    }

    public static /* synthetic */ void getSearchId$annotations() {
    }

    public static /* synthetic */ void getTermId$annotations() {
    }

    public static /* synthetic */ void getUserInput$annotations() {
    }

    public static final /* synthetic */ void write$Self$advertising_sdk_release(InterceptEvent interceptEvent, d dVar, f fVar) {
        if (dVar.e(fVar, 0) || !r.a(interceptEvent.searchId, "")) {
            dVar.g(fVar, 0, interceptEvent.searchId);
        }
        if (dVar.e(fVar, 1) || !r.a(interceptEvent.event, "")) {
            dVar.g(fVar, 1, interceptEvent.event);
        }
        if (dVar.e(fVar, 2) || !r.a(interceptEvent.userInput, "")) {
            dVar.g(fVar, 2, interceptEvent.userInput);
        }
        if (dVar.e(fVar, 3) || !r.a(interceptEvent.termId, "")) {
            dVar.g(fVar, 3, interceptEvent.termId);
        }
        if (dVar.e(fVar, 4) || !r.a(interceptEvent.term, "")) {
            dVar.g(fVar, 4, interceptEvent.term);
        }
        if (!dVar.e(fVar, 5) && interceptEvent.createdAt == new Date().getTime() / 1000) {
            return;
        }
        dVar.u(fVar, 5, interceptEvent.createdAt);
    }

    public final String component1() {
        return this.searchId;
    }

    public final String component2() {
        return this.event;
    }

    public final String component3() {
        return this.userInput;
    }

    public final String component4() {
        return this.termId;
    }

    public final String component5() {
        return this.term;
    }

    public final long component6() {
        return this.createdAt;
    }

    public final InterceptEvent copy(String str, String str2, String str3, String str4, String str5, long j8) {
        r.e(str, "searchId");
        r.e(str2, "event");
        r.e(str3, "userInput");
        r.e(str4, "termId");
        r.e(str5, "term");
        return new InterceptEvent(str, str2, str3, str4, str5, j8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterceptEvent)) {
            return false;
        }
        InterceptEvent interceptEvent = (InterceptEvent) obj;
        return r.a(this.searchId, interceptEvent.searchId) && r.a(this.event, interceptEvent.event) && r.a(this.userInput, interceptEvent.userInput) && r.a(this.termId, interceptEvent.termId) && r.a(this.term, interceptEvent.term) && this.createdAt == interceptEvent.createdAt;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final String getEvent() {
        return this.event;
    }

    public final String getSearchId() {
        return this.searchId;
    }

    public final String getTerm() {
        return this.term;
    }

    public final String getTermId() {
        return this.termId;
    }

    public final String getUserInput() {
        return this.userInput;
    }

    public int hashCode() {
        return (((((((((this.searchId.hashCode() * 31) + this.event.hashCode()) * 31) + this.userInput.hashCode()) * 31) + this.termId.hashCode()) * 31) + this.term.hashCode()) * 31) + AbstractC0626b.a(this.createdAt);
    }

    public final boolean supersedes(InterceptEvent interceptEvent) {
        r.e(interceptEvent, AdActionType.EXTERNAL_LINK);
        return r.a(this.event, interceptEvent.event) && r.a(this.termId, interceptEvent.termId) && h.G(this.userInput, interceptEvent.userInput, false, 2, null);
    }

    public String toString() {
        return "InterceptEvent(searchId=" + this.searchId + ", event=" + this.event + ", userInput=" + this.userInput + ", termId=" + this.termId + ", term=" + this.term + ", createdAt=" + this.createdAt + ")";
    }

    public /* synthetic */ InterceptEvent(int i8, String str, String str2, String str3, String str4, String str5, long j8, C0 c02) {
        if ((i8 & 1) == 0) {
            this.searchId = "";
        } else {
            this.searchId = str;
        }
        if ((i8 & 2) == 0) {
            this.event = "";
        } else {
            this.event = str2;
        }
        if ((i8 & 4) == 0) {
            this.userInput = "";
        } else {
            this.userInput = str3;
        }
        if ((i8 & 8) == 0) {
            this.termId = "";
        } else {
            this.termId = str4;
        }
        if ((i8 & 16) == 0) {
            this.term = "";
        } else {
            this.term = str5;
        }
        if ((i8 & 32) == 0) {
            this.createdAt = new Date().getTime() / 1000;
        } else {
            this.createdAt = j8;
        }
    }

    public InterceptEvent(String str, String str2, String str3, String str4, String str5, long j8) {
        r.e(str, "searchId");
        r.e(str2, "event");
        r.e(str3, "userInput");
        r.e(str4, "termId");
        r.e(str5, "term");
        this.searchId = str;
        this.event = str2;
        this.userInput = str3;
        this.termId = str4;
        this.term = str5;
        this.createdAt = j8;
    }

    public /* synthetic */ InterceptEvent(String str, String str2, String str3, String str4, String str5, long j8, int i8, AbstractC0650j abstractC0650j) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? "" : str2, (i8 & 4) != 0 ? "" : str3, (i8 & 8) != 0 ? "" : str4, (i8 & 16) == 0 ? str5 : "", (i8 & 32) != 0 ? new Date().getTime() / 1000 : j8);
    }
}
