package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Predicate$CC;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* renamed from: com.google.android.gms.internal.ads.af0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2099af0 {

    /* renamed from: c, reason: collision with root package name */
    private static final C4165tf0 f20728c = new C4165tf0("OverlayDisplayService");

    /* renamed from: d, reason: collision with root package name */
    private static final Intent f20729d = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f20730e = 0;

    /* renamed from: a, reason: collision with root package name */
    final C4056sf0 f20731a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20732b;

    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.android.gms.internal.ads.We0] */
    C2099af0(Context context) {
        if (AbstractC4383vf0.a(context)) {
            this.f20731a = new C4056sf0(context.getApplicationContext(), f20728c, "OverlayDisplayService", f20729d, new Object() { // from class: com.google.android.gms.internal.ads.We0
            });
        } else {
            this.f20731a = null;
        }
        this.f20732b = context.getPackageName();
    }

    static /* synthetic */ boolean h(String str) {
        return !k(str);
    }

    private static void i(String str, Consumer consumer) {
        if (k(str)) {
            return;
        }
        str.getClass();
        consumer.accept(str.trim());
    }

    private static boolean j(InterfaceC2751gf0 interfaceC2751gf0, String str, List list) {
        if (Collection.EL.stream(list).anyMatch(new Predicate() { // from class: com.google.android.gms.internal.ads.Xe0
            public /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            public /* synthetic */ Predicate negate() {
                return Predicate$CC.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C2099af0.h((String) obj);
            }
        })) {
            return true;
        }
        f20728c.a(str, new Object[0]);
        AbstractC2425df0 c8 = AbstractC2642ff0.c();
        c8.b(8160);
        interfaceC2751gf0.a(c8.c());
        return false;
    }

    private static boolean k(String str) {
        return AbstractC3187kg0.c(str).trim().isEmpty();
    }

    final void a() {
        if (this.f20731a == null) {
            return;
        }
        f20728c.c("unbind LMD display overlay service", new Object[0]);
        this.f20731a.n();
    }

    final void b(final AbstractC1374He0 abstractC1374He0, final InterfaceC2751gf0 interfaceC2751gf0) {
        if (this.f20731a == null) {
            f20728c.a("error: %s", "Play Store not found.");
        } else if (j(interfaceC2751gf0, "Failed to apply OverlayDisplayDismissRequest: missing appId and sessionToken.", Arrays.asList(abstractC1374He0.b(), abstractC1374He0.a()))) {
            this.f20731a.i(new Runnable() { // from class: com.google.android.gms.internal.ads.Qe0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18514o.c(abstractC1374He0, interfaceC2751gf0);
                }
            });
        }
    }

    final /* synthetic */ void c(AbstractC1374He0 abstractC1374He0, InterfaceC2751gf0 interfaceC2751gf0) {
        try {
            C4056sf0 c4056sf0 = this.f20731a;
            if (c4056sf0 == null) {
                throw null;
            }
            InterfaceC3837qe0 interfaceC3837qe0 = (InterfaceC3837qe0) c4056sf0.c();
            if (interfaceC3837qe0 == null) {
                return;
            }
            String str = this.f20732b;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            i(abstractC1374He0.b(), new Consumer() { // from class: com.google.android.gms.internal.ads.Te0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i8 = C2099af0.f20730e;
                    bundle.putString("sessionToken", (String) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            i(abstractC1374He0.a(), new Consumer() { // from class: com.google.android.gms.internal.ads.Ue0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i8 = C2099af0.f20730e;
                    bundle.putString("appId", (String) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            interfaceC3837qe0.F4(bundle, new BinderC2005Ze0(this, interfaceC2751gf0));
        } catch (RemoteException e8) {
            f20728c.b(e8, "dismiss overlay display from: %s", this.f20732b);
        }
    }

    final /* synthetic */ void d(AbstractC2316cf0 abstractC2316cf0, InterfaceC2751gf0 interfaceC2751gf0) {
        try {
            C4056sf0 c4056sf0 = this.f20731a;
            if (c4056sf0 == null) {
                throw null;
            }
            InterfaceC3837qe0 interfaceC3837qe0 = (InterfaceC3837qe0) c4056sf0.c();
            if (interfaceC3837qe0 == null) {
                return;
            }
            String str = this.f20732b;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            bundle.putBinder("windowToken", abstractC2316cf0.f());
            i(abstractC2316cf0.g(), new Consumer() { // from class: com.google.android.gms.internal.ads.Ye0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i8 = C2099af0.f20730e;
                    bundle.putString("adFieldEnifd", (String) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            bundle.putInt("layoutGravity", abstractC2316cf0.c());
            bundle.putFloat("layoutVerticalMargin", abstractC2316cf0.a());
            bundle.putInt("displayMode", 0);
            bundle.putInt("triggerMode", 0);
            bundle.putInt("windowWidthPx", abstractC2316cf0.e());
            i(null, new Consumer() { // from class: com.google.android.gms.internal.ads.Me0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i8 = C2099af0.f20730e;
                    bundle.putString("deeplinkUrl", (String) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            i(null, new Consumer() { // from class: com.google.android.gms.internal.ads.Ne0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i8 = C2099af0.f20730e;
                    bundle.putString("sessionToken", (String) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            i(abstractC2316cf0.h(), new Consumer() { // from class: com.google.android.gms.internal.ads.Oe0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i8 = C2099af0.f20730e;
                    bundle.putString("appId", (String) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            i(null, new Consumer() { // from class: com.google.android.gms.internal.ads.Pe0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i8 = C2099af0.f20730e;
                    bundle.putString("thirdPartyAuthCallerId", (String) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            bundle.putBoolean("stableSessionToken", true);
            interfaceC3837qe0.O5(str, bundle, new BinderC2005Ze0(this, interfaceC2751gf0));
        } catch (RemoteException e8) {
            f20728c.b(e8, "show overlay display from: %s", this.f20732b);
        }
    }

    final /* synthetic */ void e(AbstractC2968if0 abstractC2968if0, int i8, InterfaceC2751gf0 interfaceC2751gf0) {
        try {
            C4056sf0 c4056sf0 = this.f20731a;
            if (c4056sf0 == null) {
                throw null;
            }
            InterfaceC3837qe0 interfaceC3837qe0 = (InterfaceC3837qe0) c4056sf0.c();
            if (interfaceC3837qe0 == null) {
                return;
            }
            String str = this.f20732b;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            bundle.putInt("displayMode", i8);
            i(abstractC2968if0.b(), new Consumer() { // from class: com.google.android.gms.internal.ads.Le0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i9 = C2099af0.f20730e;
                    bundle.putString("sessionToken", (String) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            i(abstractC2968if0.a(), new Consumer() { // from class: com.google.android.gms.internal.ads.Re0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i9 = C2099af0.f20730e;
                    bundle.putString("appId", (String) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            interfaceC3837qe0.S2(bundle, new BinderC2005Ze0(this, interfaceC2751gf0));
        } catch (RemoteException e8) {
            f20728c.b(e8, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i8), this.f20732b);
        }
    }

    final void f(final AbstractC2316cf0 abstractC2316cf0, final InterfaceC2751gf0 interfaceC2751gf0) {
        if (this.f20731a == null) {
            f20728c.a("error: %s", "Play Store not found.");
        } else if (j(interfaceC2751gf0, "Failed to apply OverlayDisplayShowRequest: missing appId and sessionToken.", Arrays.asList(null, abstractC2316cf0.h()))) {
            this.f20731a.i(new Runnable() { // from class: com.google.android.gms.internal.ads.Ve0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19635o.d(abstractC2316cf0, interfaceC2751gf0);
                }
            });
        }
    }

    final void g(final AbstractC2968if0 abstractC2968if0, final InterfaceC2751gf0 interfaceC2751gf0, final int i8) {
        if (this.f20731a == null) {
            f20728c.a("error: %s", "Play Store not found.");
        } else if (j(interfaceC2751gf0, "Failed to apply OverlayDisplayUpdateRequest: missing appId and sessionToken.", Arrays.asList(abstractC2968if0.b(), abstractC2968if0.a()))) {
            this.f20731a.i(new Runnable() { // from class: com.google.android.gms.internal.ads.Se0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18935o.e(abstractC2968if0, i8, interfaceC2751gf0);
                }
            });
        }
    }
}
