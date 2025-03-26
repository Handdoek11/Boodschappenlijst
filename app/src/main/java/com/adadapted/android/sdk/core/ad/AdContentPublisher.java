package com.adadapted.android.sdk.core.ad;

import A6.d;
import B6.b;
import I6.p;
import J6.r;
import U6.M;
import com.adadapted.android.sdk.core.concurrency.Transporter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import x6.C6916E;
import x6.q;

/* loaded from: classes.dex */
public final class AdContentPublisher {
    public static final AdContentPublisher INSTANCE = new AdContentPublisher();
    private static Transporter transporter = new Transporter();
    private static final Set<AdContentListener> listeners = new HashSet();
    public static final int $stable = 8;

    @f(c = "com.adadapted.android.sdk.core.ad.AdContentPublisher$publishContent$1", f = "AdContentPublisher.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.adadapted.android.sdk.core.ad.AdContentPublisher$publishContent$1, reason: invalid class name */
    static final class AnonymousClass1 extends l implements p {
        final /* synthetic */ AdContent $content;
        final /* synthetic */ String $zoneId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, AdContent adContent, d dVar) {
            super(2, dVar);
            this.$zoneId = str;
            this.$content = adContent;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new AnonymousClass1(this.$zoneId, this.$content, dVar);
        }

        @Override // I6.p
        public final Object invoke(M m8, d dVar) {
            return ((AnonymousClass1) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(obj);
            Iterator it = AdContentPublisher.listeners.iterator();
            while (it.hasNext()) {
                ((AdContentListener) it.next()).onContentAvailable(this.$zoneId, this.$content);
            }
            return C6916E.f44463a;
        }
    }

    @f(c = "com.adadapted.android.sdk.core.ad.AdContentPublisher$publishNonContentNotification$1", f = "AdContentPublisher.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.adadapted.android.sdk.core.ad.AdContentPublisher$publishNonContentNotification$1, reason: invalid class name and case insensitive filesystem */
    static final class C10231 extends l implements p {
        final /* synthetic */ String $adId;
        final /* synthetic */ String $zoneId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10231(String str, String str2, d dVar) {
            super(2, dVar);
            this.$zoneId = str;
            this.$adId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C10231(this.$zoneId, this.$adId, dVar);
        }

        @Override // I6.p
        public final Object invoke(M m8, d dVar) {
            return ((C10231) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(obj);
            Iterator it = AdContentPublisher.listeners.iterator();
            while (it.hasNext()) {
                ((AdContentListener) it.next()).onNonContentAction(this.$zoneId, this.$adId);
            }
            return C6916E.f44463a;
        }
    }

    private AdContentPublisher() {
    }

    public final void addListener(AdContentListener adContentListener) {
        r.e(adContentListener, "listener");
        listeners.add(adContentListener);
    }

    public final void publishContent(String str, AdContent adContent) {
        r.e(str, "zoneId");
        r.e(adContent, "content");
        if (adContent.hasNoItems()) {
            return;
        }
        transporter.dispatchToMain(new AnonymousClass1(str, adContent, null));
    }

    public final void publishNonContentNotification(String str, String str2) {
        r.e(str, "zoneId");
        r.e(str2, "adId");
        transporter.dispatchToMain(new C10231(str, str2, null));
    }

    public final void removeListener(AdContentListener adContentListener) {
        r.e(adContentListener, "listener");
        listeners.remove(adContentListener);
    }
}
