package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.emoji2.text.f;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import w0.l;

/* loaded from: classes.dex */
public class k extends f.c {

    /* renamed from: k, reason: collision with root package name */
    private static final a f9679k = new a();

    public static class a {
        public Typeface a(Context context, l.b bVar) {
            return w0.l.a(context, null, new l.b[]{bVar});
        }

        public l.a b(Context context, w0.f fVar) {
            return w0.l.b(context, null, fVar);
        }

        public void c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b implements f.h {

        /* renamed from: a, reason: collision with root package name */
        private final Context f9680a;

        /* renamed from: b, reason: collision with root package name */
        private final w0.f f9681b;

        /* renamed from: c, reason: collision with root package name */
        private final a f9682c;

        /* renamed from: d, reason: collision with root package name */
        private final Object f9683d = new Object();

        /* renamed from: e, reason: collision with root package name */
        private Handler f9684e;

        /* renamed from: f, reason: collision with root package name */
        private Executor f9685f;

        /* renamed from: g, reason: collision with root package name */
        private ThreadPoolExecutor f9686g;

        /* renamed from: h, reason: collision with root package name */
        f.i f9687h;

        /* renamed from: i, reason: collision with root package name */
        private ContentObserver f9688i;

        /* renamed from: j, reason: collision with root package name */
        private Runnable f9689j;

        b(Context context, w0.f fVar, a aVar) {
            y0.i.h(context, "Context cannot be null");
            y0.i.h(fVar, "FontRequest cannot be null");
            this.f9680a = context.getApplicationContext();
            this.f9681b = fVar;
            this.f9682c = aVar;
        }

        private void b() {
            synchronized (this.f9683d) {
                try {
                    this.f9687h = null;
                    ContentObserver contentObserver = this.f9688i;
                    if (contentObserver != null) {
                        this.f9682c.c(this.f9680a, contentObserver);
                        this.f9688i = null;
                    }
                    Handler handler = this.f9684e;
                    if (handler != null) {
                        handler.removeCallbacks(this.f9689j);
                    }
                    this.f9684e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f9686g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f9685f = null;
                    this.f9686g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private l.b e() {
            try {
                l.a b8 = this.f9682c.b(this.f9680a, this.f9681b);
                if (b8.e() == 0) {
                    l.b[] c8 = b8.c();
                    if (c8 == null || c8.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return c8[0];
                }
                throw new RuntimeException("fetchFonts failed (" + b8.e() + ")");
            } catch (PackageManager.NameNotFoundException e8) {
                throw new RuntimeException("provider not found", e8);
            }
        }

        @Override // androidx.emoji2.text.f.h
        public void a(f.i iVar) {
            y0.i.h(iVar, "LoaderCallback cannot be null");
            synchronized (this.f9683d) {
                this.f9687h = iVar;
            }
            d();
        }

        void c() {
            synchronized (this.f9683d) {
                try {
                    if (this.f9687h == null) {
                        return;
                    }
                    try {
                        l.b e8 = e();
                        int b8 = e8.b();
                        if (b8 == 2) {
                            synchronized (this.f9683d) {
                            }
                        }
                        if (b8 != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + b8 + ")");
                        }
                        try {
                            v0.u.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface a8 = this.f9682c.a(this.f9680a, e8);
                            ByteBuffer f8 = q0.o.f(this.f9680a, null, e8.d());
                            if (f8 == null || a8 == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            n b9 = n.b(a8, f8);
                            v0.u.b();
                            synchronized (this.f9683d) {
                                try {
                                    f.i iVar = this.f9687h;
                                    if (iVar != null) {
                                        iVar.b(b9);
                                    }
                                } finally {
                                }
                            }
                            b();
                        } catch (Throwable th) {
                            v0.u.b();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        synchronized (this.f9683d) {
                            try {
                                f.i iVar2 = this.f9687h;
                                if (iVar2 != null) {
                                    iVar2.a(th2);
                                }
                                b();
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        void d() {
            synchronized (this.f9683d) {
                try {
                    if (this.f9687h == null) {
                        return;
                    }
                    if (this.f9685f == null) {
                        ThreadPoolExecutor b8 = c.b("emojiCompat");
                        this.f9686g = b8;
                        this.f9685f = b8;
                    }
                    this.f9685f.execute(new Runnable() { // from class: androidx.emoji2.text.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f9690o.c();
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void f(Executor executor) {
            synchronized (this.f9683d) {
                this.f9685f = executor;
            }
        }
    }

    public k(Context context, w0.f fVar) {
        super(new b(context, fVar, f9679k));
    }

    public k c(Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}
