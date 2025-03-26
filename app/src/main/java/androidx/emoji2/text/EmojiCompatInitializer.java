package androidx.emoji2.text;

import android.content.Context;
import androidx.emoji2.text.f;
import androidx.lifecycle.AbstractC0917c;
import androidx.lifecycle.AbstractC0922h;
import androidx.lifecycle.InterfaceC0918d;
import androidx.lifecycle.InterfaceC0927m;
import androidx.lifecycle.ProcessLifecycleInitializer;
import i1.InterfaceC5847a;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC5847a {

    static class a extends f.c {
        protected a(Context context) {
            super(new b(context));
            b(1);
        }
    }

    static class b implements f.h {

        /* renamed from: a, reason: collision with root package name */
        private final Context f9613a;

        class a extends f.i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f.i f9614a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ThreadPoolExecutor f9615b;

            a(f.i iVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f9614a = iVar;
                this.f9615b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.f.i
            public void a(Throwable th) {
                try {
                    this.f9614a.a(th);
                } finally {
                    this.f9615b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.f.i
            public void b(n nVar) {
                try {
                    this.f9614a.b(nVar);
                } finally {
                    this.f9615b.shutdown();
                }
            }
        }

        b(Context context) {
            this.f9613a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.f.h
        public void a(final f.i iVar) {
            final ThreadPoolExecutor b8 = androidx.emoji2.text.c.b("EmojiCompatInitializer");
            b8.execute(new Runnable() { // from class: androidx.emoji2.text.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9655o.d(iVar, b8);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void d(f.i iVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                k a8 = d.a(this.f9613a);
                if (a8 == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                a8.c(threadPoolExecutor);
                a8.a().a(new a(iVar, threadPoolExecutor));
            } catch (Throwable th) {
                iVar.a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    static class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                v0.u.a("EmojiCompat.EmojiCompatInitializer.run");
                if (f.i()) {
                    f.c().l();
                }
            } finally {
                v0.u.b();
            }
        }
    }

    @Override // i1.InterfaceC5847a
    public List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // i1.InterfaceC5847a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean b(Context context) {
        f.h(new a(context));
        d(context);
        return Boolean.TRUE;
    }

    void d(Context context) {
        final AbstractC0922h lifecycle = ((InterfaceC0927m) androidx.startup.a.e(context).f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.a(new InterfaceC0918d() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.InterfaceC0918d
            public void d(InterfaceC0927m interfaceC0927m) {
                EmojiCompatInitializer.this.e();
                lifecycle.c(this);
            }

            @Override // androidx.lifecycle.InterfaceC0918d
            public /* synthetic */ void e(InterfaceC0927m interfaceC0927m) {
                AbstractC0917c.a(this, interfaceC0927m);
            }

            @Override // androidx.lifecycle.InterfaceC0918d
            public /* synthetic */ void h(InterfaceC0927m interfaceC0927m) {
                AbstractC0917c.c(this, interfaceC0927m);
            }

            @Override // androidx.lifecycle.InterfaceC0918d
            public /* synthetic */ void onDestroy(InterfaceC0927m interfaceC0927m) {
                AbstractC0917c.b(this, interfaceC0927m);
            }

            @Override // androidx.lifecycle.InterfaceC0918d
            public /* synthetic */ void onStart(InterfaceC0927m interfaceC0927m) {
                AbstractC0917c.e(this, interfaceC0927m);
            }

            @Override // androidx.lifecycle.InterfaceC0918d
            public /* synthetic */ void onStop(InterfaceC0927m interfaceC0927m) {
                AbstractC0917c.f(this, interfaceC0927m);
            }
        });
    }

    void e() {
        androidx.emoji2.text.c.d().postDelayed(new c(), 500L);
    }
}
