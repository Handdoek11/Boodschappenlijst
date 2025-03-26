package com.adadapted.android.sdk.core.keyword;

import J6.AbstractC0650j;
import J6.r;
import S6.h;
import com.adadapted.android.sdk.core.interfaces.InterceptListener;
import com.adadapted.android.sdk.core.session.Session;
import com.adadapted.android.sdk.core.session.SessionClient;
import com.adadapted.android.sdk.core.session.SessionListener;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import y6.P;

/* loaded from: classes.dex */
public final class KeywordInterceptMatcher implements SessionListener, InterceptListener {
    public static final int $stable;
    public static final KeywordInterceptMatcher INSTANCE;
    private static boolean hasInstance;
    private static Intercept intercept;
    private static boolean mLoaded;

    static {
        KeywordInterceptMatcher keywordInterceptMatcher = new KeywordInterceptMatcher();
        INSTANCE = keywordInterceptMatcher;
        intercept = new Intercept((String) null, 0L, 0, (List) null, 15, (AbstractC0650j) null);
        SessionClient.INSTANCE.addListener(keywordInterceptMatcher);
        $stable = 8;
    }

    private KeywordInterceptMatcher() {
    }

    private final void createInstance() {
        hasInstance = true;
    }

    private final void fileTerm(Term term, String str, Set<Suggestion> set) {
        if (term != null) {
            set.add(new Suggestion(intercept.getSearchId(), term));
            SuggestionTracker.INSTANCE.suggestionMatched(intercept.getSearchId(), term.getTermId(), term.getSearchTerm(), term.getReplacement(), str);
        }
    }

    private final boolean isLoaded() {
        return mLoaded;
    }

    private final boolean isReadyToMatch(String str) {
        return isLoaded() && str != null && str.length() >= intercept.getMinMatchLength();
    }

    private final Set<Suggestion> matchKeyword(CharSequence charSequence) {
        HashSet hashSet = new HashSet();
        String obj = charSequence.toString();
        if (!isReadyToMatch(obj)) {
            return hashSet;
        }
        for (Term term : intercept.getTerms()) {
            if (h.z(term.getSearchTerm(), obj, true)) {
                fileTerm(term, obj, hashSet);
            }
        }
        if (hashSet.isEmpty()) {
            SuggestionTracker.INSTANCE.suggestionNotMatched(intercept.getSearchId(), charSequence.toString());
        }
        return hashSet;
    }

    public final Set<Suggestion> match(CharSequence charSequence) {
        r.e(charSequence, "constraint");
        if (hasInstance) {
            return matchKeyword(charSequence);
        }
        if (!SessionClient.INSTANCE.hasInstance()) {
            return P.b();
        }
        createInstance();
        return matchKeyword(charSequence);
    }

    @Override // com.adadapted.android.sdk.core.session.SessionListener
    public void onAdsAvailable(Session session) {
        SessionListener.DefaultImpls.onAdsAvailable(this, session);
    }

    @Override // com.adadapted.android.sdk.core.interfaces.InterceptListener
    public void onKeywordInterceptInitialized(Intercept intercept2) {
        r.e(intercept2, "intercept");
        intercept = intercept2;
        mLoaded = true;
    }

    @Override // com.adadapted.android.sdk.core.session.SessionListener
    public void onPublishEvents() {
        SessionListener.DefaultImpls.onPublishEvents(this);
    }

    @Override // com.adadapted.android.sdk.core.session.SessionListener
    public void onSessionAvailable(Session session) {
        r.e(session, "session");
        if (session.getId().length() > 0) {
            InterceptClient.Companion.getInstance().initialize(session, this);
        }
    }

    @Override // com.adadapted.android.sdk.core.session.SessionListener
    public void onSessionExpired() {
        SessionListener.DefaultImpls.onSessionExpired(this);
    }

    @Override // com.adadapted.android.sdk.core.session.SessionListener
    public void onSessionInitFailed() {
        SessionListener.DefaultImpls.onSessionInitFailed(this);
    }
}
