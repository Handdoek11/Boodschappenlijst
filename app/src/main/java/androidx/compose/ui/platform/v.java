package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.lifecycle.InterfaceC0927m;
import f1.InterfaceC5764d;
import kotlin.KotlinNothingValueException;
import t.AbstractC6768f;
import t.AbstractC6772j;
import t.InterfaceC6766d;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    private static final t.z f8254a = AbstractC6772j.c(null, a.f8260o, 1, null);

    /* renamed from: b, reason: collision with root package name */
    private static final t.z f8255b = AbstractC6772j.d(b.f8261o);

    /* renamed from: c, reason: collision with root package name */
    private static final t.z f8256c = AbstractC6772j.d(c.f8262o);

    /* renamed from: d, reason: collision with root package name */
    private static final t.z f8257d = AbstractC6772j.d(d.f8263o);

    /* renamed from: e, reason: collision with root package name */
    private static final t.z f8258e = AbstractC6772j.d(e.f8264o);

    /* renamed from: f, reason: collision with root package name */
    private static final t.z f8259f = AbstractC6772j.d(f.f8265o);

    static final class a extends J6.s implements I6.a {

        /* renamed from: o, reason: collision with root package name */
        public static final a f8260o = new a();

        a() {
            super(0);
        }

        @Override // I6.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Configuration invoke() {
            v.c("LocalConfiguration");
            throw new KotlinNothingValueException();
        }
    }

    static final class b extends J6.s implements I6.a {

        /* renamed from: o, reason: collision with root package name */
        public static final b f8261o = new b();

        b() {
            super(0);
        }

        @Override // I6.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Context invoke() {
            v.c("LocalContext");
            throw new KotlinNothingValueException();
        }
    }

    static final class c extends J6.s implements I6.a {

        /* renamed from: o, reason: collision with root package name */
        public static final c f8262o = new c();

        c() {
            super(0);
        }

        @Override // I6.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final R.a invoke() {
            v.c("LocalImageVectorCache");
            throw new KotlinNothingValueException();
        }
    }

    static final class d extends J6.s implements I6.a {

        /* renamed from: o, reason: collision with root package name */
        public static final d f8263o = new d();

        d() {
            super(0);
        }

        @Override // I6.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC0927m invoke() {
            v.c("LocalLifecycleOwner");
            throw new KotlinNothingValueException();
        }
    }

    static final class e extends J6.s implements I6.a {

        /* renamed from: o, reason: collision with root package name */
        public static final e f8264o = new e();

        e() {
            super(0);
        }

        @Override // I6.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC5764d invoke() {
            v.c("LocalSavedStateRegistryOwner");
            throw new KotlinNothingValueException();
        }
    }

    static final class f extends J6.s implements I6.a {

        /* renamed from: o, reason: collision with root package name */
        public static final f f8265o = new f();

        f() {
            super(0);
        }

        @Override // I6.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final View invoke() {
            v.c("LocalView");
            throw new KotlinNothingValueException();
        }
    }

    public static final void a(AndroidComposeView androidComposeView, I6.p pVar, InterfaceC6766d interfaceC6766d, int i8) {
        interfaceC6766d.f(1396852028);
        if (AbstractC6768f.c()) {
            AbstractC6768f.e(1396852028, i8, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals (AndroidCompositionLocals.android.kt:83)");
        }
        androidComposeView.getContext();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void c(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
