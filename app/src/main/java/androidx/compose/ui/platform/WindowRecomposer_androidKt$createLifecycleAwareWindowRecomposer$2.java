package androidx.compose.ui.platform;

import U6.AbstractC0723k;
import U6.InterfaceC0745v0;
import U6.M;
import U6.O;
import android.view.View;
import androidx.lifecycle.AbstractC0922h;
import androidx.lifecycle.InterfaceC0925k;
import androidx.lifecycle.InterfaceC0927m;
import x6.C6916E;

/* loaded from: classes.dex */
public final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 implements InterfaceC0925k {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ M f8219o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ J6.G f8220s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ View f8221t;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8222a;

        static {
            int[] iArr = new int[AbstractC0922h.a.values().length];
            try {
                iArr[AbstractC0922h.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC0922h.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC0922h.a.ON_STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC0922h.a.ON_DESTROY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC0922h.a.ON_PAUSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC0922h.a.ON_RESUME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AbstractC0922h.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f8222a = iArr;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements I6.p {

        /* renamed from: o, reason: collision with root package name */
        int f8223o;

        /* renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f8224s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ J6.G f8225t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ InterfaceC0927m f8226u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 f8227v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ View f8228w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(J6.G g8, t.D d8, InterfaceC0927m interfaceC0927m, WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2, View view, A6.d dVar) {
            super(2, dVar);
            this.f8225t = g8;
            this.f8226u = interfaceC0927m;
            this.f8227v = windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2;
            this.f8228w = view;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final A6.d create(Object obj, A6.d dVar) {
            b bVar = new b(this.f8225t, null, this.f8226u, this.f8227v, this.f8228w, dVar);
            bVar.f8224s = obj;
            return bVar;
        }

        @Override // I6.p
        public final Object invoke(M m8, A6.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InterfaceC0745v0 interfaceC0745v0;
            B6.b.e();
            int i8 = this.f8223o;
            if (i8 == 0) {
                x6.q.b(obj);
                try {
                    androidx.appcompat.app.E.a(this.f8225t.f3547o);
                    this.f8224s = null;
                    this.f8223o = 1;
                    throw null;
                } catch (Throwable th) {
                    th = th;
                    interfaceC0745v0 = null;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC0745v0 = (InterfaceC0745v0) this.f8224s;
                try {
                    x6.q.b(obj);
                    if (interfaceC0745v0 != null) {
                        InterfaceC0745v0.a.a(interfaceC0745v0, null, 1, null);
                    }
                    this.f8226u.getLifecycle().c(this.f8227v);
                    return C6916E.f44463a;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (interfaceC0745v0 != null) {
                InterfaceC0745v0.a.a(interfaceC0745v0, null, 1, null);
            }
            this.f8226u.getLifecycle().c(this.f8227v);
            throw th;
        }
    }

    @Override // androidx.lifecycle.InterfaceC0925k
    public void f(InterfaceC0927m interfaceC0927m, AbstractC0922h.a aVar) {
        int i8 = a.f8222a[aVar.ordinal()];
        if (i8 == 1) {
            AbstractC0723k.d(this.f8219o, null, O.UNDISPATCHED, new b(this.f8220s, null, interfaceC0927m, this, this.f8221t, null), 1, null);
            return;
        }
        Object obj = null;
        if (i8 == 2) {
            obj.getClass();
            throw null;
        }
        if (i8 == 3 || i8 == 4) {
            throw null;
        }
    }
}
