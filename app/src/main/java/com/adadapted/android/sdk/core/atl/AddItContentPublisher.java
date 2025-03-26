package com.adadapted.android.sdk.core.atl;

import A6.d;
import B6.b;
import I6.p;
import J6.r;
import U6.M;
import com.adadapted.android.sdk.constants.EventStrings;
import com.adadapted.android.sdk.core.ad.AdContent;
import com.adadapted.android.sdk.core.concurrency.Transporter;
import com.adadapted.android.sdk.core.event.EventClient;
import com.adadapted.android.sdk.core.interfaces.AaSdkAdditContentListener;
import com.adadapted.android.sdk.core.log.AALogger;
import java.util.HashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import x6.C6916E;
import x6.q;

/* loaded from: classes.dex */
public final class AddItContentPublisher {
    private static AaSdkAdditContentListener listener;
    public static final AddItContentPublisher INSTANCE = new AddItContentPublisher();
    private static Transporter transporter = new Transporter();
    private static final Map<String, AdditContent> publishedContent = new HashMap();
    public static final int $stable = 8;

    @f(c = "com.adadapted.android.sdk.core.atl.AddItContentPublisher$notifyContentAvailable$1", f = "AddItContentPublisher.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.adadapted.android.sdk.core.atl.AddItContentPublisher$notifyContentAvailable$1, reason: invalid class name */
    static final class AnonymousClass1 extends l implements p {
        final /* synthetic */ AddToListContent $content;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AddToListContent addToListContent, d dVar) {
            super(2, dVar);
            this.$content = addToListContent;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new AnonymousClass1(this.$content, dVar);
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
            AaSdkAdditContentListener aaSdkAdditContentListener = AddItContentPublisher.listener;
            if (aaSdkAdditContentListener != null) {
                aaSdkAdditContentListener.onContentAvailable(this.$content);
            }
            return C6916E.f44463a;
        }
    }

    private AddItContentPublisher() {
    }

    private final void contentListenerNotAdded() {
        AALogger.INSTANCE.logError(EventStrings.LISTENER_REGISTRATION_ERROR);
    }

    private final void notifyContentAvailable(AddToListContent addToListContent) {
        transporter.dispatchToMain(new AnonymousClass1(addToListContent, null));
    }

    public final void addListener(AaSdkAdditContentListener aaSdkAdditContentListener) {
        r.e(aaSdkAdditContentListener, "listener");
        listener = aaSdkAdditContentListener;
    }

    public final void publishAdContent(AdContent adContent) {
        r.e(adContent, "content");
        if (adContent.hasNoItems()) {
            return;
        }
        if (listener != null) {
            notifyContentAvailable(adContent);
        } else {
            EventClient.trackSdkError$default(EventClient.INSTANCE, EventStrings.NO_ADDIT_CONTENT_LISTENER, EventStrings.LISTENER_REGISTRATION_ERROR, null, 4, null);
            contentListenerNotAdded();
        }
    }

    public final void publishAddItContent(AdditContent additContent) {
        r.e(additContent, "content");
        if (additContent.hasNoItems()) {
            return;
        }
        if (listener == null) {
            EventClient.trackSdkError$default(EventClient.INSTANCE, EventStrings.NO_ADDIT_CONTENT_LISTENER, EventStrings.LISTENER_REGISTRATION_ERROR, null, 4, null);
            contentListenerNotAdded();
            return;
        }
        Map<String, AdditContent> map = publishedContent;
        if (map.containsKey(additContent.getPayloadId())) {
            additContent.duplicate();
        } else if (listener != null) {
            map.put(additContent.getPayloadId(), additContent);
            notifyContentAvailable(additContent);
        }
    }

    public final void publishPopupContent(PopupContent popupContent) {
        r.e(popupContent, "content");
        if (popupContent.hasNoItems()) {
            return;
        }
        if (listener != null) {
            notifyContentAvailable(popupContent);
        } else {
            EventClient.trackSdkError$default(EventClient.INSTANCE, EventStrings.NO_ADDIT_CONTENT_LISTENER, EventStrings.LISTENER_REGISTRATION_ERROR, null, 4, null);
            contentListenerNotAdded();
        }
    }
}
