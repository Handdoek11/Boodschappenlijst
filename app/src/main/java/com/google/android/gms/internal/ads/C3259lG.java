package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.internal.ads.lG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3259lG extends AbstractC2714gF implements InterfaceC4701yb {

    /* renamed from: s, reason: collision with root package name */
    private final Map f24293s;

    /* renamed from: t, reason: collision with root package name */
    private final Context f24294t;

    /* renamed from: u, reason: collision with root package name */
    private final C3785q60 f24295u;

    public C3259lG(Context context, Set set, C3785q60 c3785q60) {
        super(set);
        this.f24293s = new WeakHashMap(1);
        this.f24294t = context;
        this.f24295u = c3785q60;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4701yb
    public final synchronized void A0(final C4592xb c4592xb) {
        l1(new InterfaceC2605fF() { // from class: com.google.android.gms.internal.ads.kG
            @Override // com.google.android.gms.internal.ads.InterfaceC2605fF
            public final void a(Object obj) {
                ((InterfaceC4701yb) obj).A0(c4592xb);
            }
        });
    }

    public final synchronized void m1(View view) {
        try {
            ViewOnAttachStateChangeListenerC4810zb viewOnAttachStateChangeListenerC4810zb = (ViewOnAttachStateChangeListenerC4810zb) this.f24293s.get(view);
            if (viewOnAttachStateChangeListenerC4810zb == null) {
                ViewOnAttachStateChangeListenerC4810zb viewOnAttachStateChangeListenerC4810zb2 = new ViewOnAttachStateChangeListenerC4810zb(this.f24294t, view);
                viewOnAttachStateChangeListenerC4810zb2.c(this);
                this.f24293s.put(view, viewOnAttachStateChangeListenerC4810zb2);
                viewOnAttachStateChangeListenerC4810zb = viewOnAttachStateChangeListenerC4810zb2;
            }
            if (this.f24295u.f25775X) {
                if (((Boolean) D2.A.c().a(AbstractC3184kf.f24043x1)).booleanValue()) {
                    viewOnAttachStateChangeListenerC4810zb.g(((Long) D2.A.c().a(AbstractC3184kf.f24035w1)).longValue());
                    return;
                }
            }
            viewOnAttachStateChangeListenerC4810zb.f();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void p1(View view) {
        if (this.f24293s.containsKey(view)) {
            ((ViewOnAttachStateChangeListenerC4810zb) this.f24293s.get(view)).e(this);
            this.f24293s.remove(view);
        }
    }
}
