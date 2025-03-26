package com.adadapted.android.sdk.core.keyword;

import J6.r;

/* loaded from: classes.dex */
public final class Suggestion {
    public static final int $stable = 8;
    private final String icon;
    private final String name;
    private boolean presented;
    private final String searchId;
    private boolean selected;
    private final String tagline;
    private final Term term;
    private final String termId;

    public Suggestion(String str, Term term) {
        r.e(str, "searchId");
        r.e(term, "term");
        this.searchId = str;
        this.term = term;
        this.termId = term.getTermId();
        this.name = term.getReplacement();
        this.icon = term.getIcon();
        this.tagline = term.getTagline();
        this.presented = false;
        this.selected = false;
    }

    private final Term component2() {
        return this.term;
    }

    public static /* synthetic */ Suggestion copy$default(Suggestion suggestion, String str, Term term, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = suggestion.searchId;
        }
        if ((i8 & 2) != 0) {
            term = suggestion.term;
        }
        return suggestion.copy(str, term);
    }

    public final String component1() {
        return this.searchId;
    }

    public final Suggestion copy(String str, Term term) {
        r.e(str, "searchId");
        r.e(term, "term");
        return new Suggestion(str, term);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Suggestion)) {
            return false;
        }
        Suggestion suggestion = (Suggestion) obj;
        return r.a(this.searchId, suggestion.searchId) && r.a(this.term, suggestion.term);
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getPresented() {
        return this.presented;
    }

    public final String getSearchId() {
        return this.searchId;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final String getTagline() {
        return this.tagline;
    }

    public final String getTermId() {
        return this.termId;
    }

    public int hashCode() {
        return (this.searchId.hashCode() * 31) + this.term.hashCode();
    }

    public final void presented() {
        if (this.presented) {
            return;
        }
        this.presented = true;
        SuggestionTracker.INSTANCE.suggestionPresented(this.searchId, this.termId, this.name);
    }

    public final void selected() {
        if (this.selected) {
            return;
        }
        this.selected = true;
        SuggestionTracker.INSTANCE.suggestionSelected(this.searchId, this.termId, this.name);
    }

    public final void setPresented(boolean z7) {
        this.presented = z7;
    }

    public final void setSelected(boolean z7) {
        this.selected = z7;
    }

    public String toString() {
        return "Suggestion(searchId=" + this.searchId + ", term=" + this.term + ")";
    }
}
