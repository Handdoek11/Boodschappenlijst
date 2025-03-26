package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import q.C6398b;

/* loaded from: classes.dex */
public class f {

    /* renamed from: o, reason: collision with root package name */
    private static final Object f9621o = new Object();

    /* renamed from: p, reason: collision with root package name */
    private static final Object f9622p = new Object();

    /* renamed from: q, reason: collision with root package name */
    private static volatile f f9623q;

    /* renamed from: b, reason: collision with root package name */
    private final Set f9625b;

    /* renamed from: e, reason: collision with root package name */
    private final b f9628e;

    /* renamed from: f, reason: collision with root package name */
    final h f9629f;

    /* renamed from: g, reason: collision with root package name */
    private final j f9630g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f9631h;

    /* renamed from: i, reason: collision with root package name */
    final boolean f9632i;

    /* renamed from: j, reason: collision with root package name */
    final int[] f9633j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f9634k;

    /* renamed from: l, reason: collision with root package name */
    private final int f9635l;

    /* renamed from: m, reason: collision with root package name */
    private final int f9636m;

    /* renamed from: n, reason: collision with root package name */
    private final e f9637n;

    /* renamed from: a, reason: collision with root package name */
    private final ReadWriteLock f9624a = new ReentrantReadWriteLock();

    /* renamed from: c, reason: collision with root package name */
    private volatile int f9626c = 3;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f9627d = new Handler(Looper.getMainLooper());

    private static final class a extends b {

        /* renamed from: b, reason: collision with root package name */
        private volatile androidx.emoji2.text.i f9638b;

        /* renamed from: c, reason: collision with root package name */
        private volatile n f9639c;

        /* renamed from: androidx.emoji2.text.f$a$a, reason: collision with other inner class name */
        class C0160a extends i {
            C0160a() {
            }

            @Override // androidx.emoji2.text.f.i
            public void a(Throwable th) {
                a.this.f9641a.n(th);
            }

            @Override // androidx.emoji2.text.f.i
            public void b(n nVar) {
                a.this.d(nVar);
            }
        }

        a(f fVar) {
            super(fVar);
        }

        @Override // androidx.emoji2.text.f.b
        void a() {
            try {
                this.f9641a.f9629f.a(new C0160a());
            } catch (Throwable th) {
                this.f9641a.n(th);
            }
        }

        @Override // androidx.emoji2.text.f.b
        CharSequence b(CharSequence charSequence, int i8, int i9, int i10, boolean z7) {
            return this.f9638b.h(charSequence, i8, i9, i10, z7);
        }

        @Override // androidx.emoji2.text.f.b
        void c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f9639c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f9641a.f9631h);
        }

        void d(n nVar) {
            if (nVar == null) {
                this.f9641a.n(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f9639c = nVar;
            n nVar2 = this.f9639c;
            j jVar = this.f9641a.f9630g;
            e eVar = this.f9641a.f9637n;
            f fVar = this.f9641a;
            this.f9638b = new androidx.emoji2.text.i(nVar2, jVar, eVar, fVar.f9632i, fVar.f9633j, androidx.emoji2.text.h.a());
            this.f9641a.o();
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        final f f9641a;

        b(f fVar) {
            this.f9641a = fVar;
        }

        abstract void a();

        abstract CharSequence b(CharSequence charSequence, int i8, int i9, int i10, boolean z7);

        abstract void c(EditorInfo editorInfo);
    }

    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        final h f9642a;

        /* renamed from: b, reason: collision with root package name */
        j f9643b;

        /* renamed from: c, reason: collision with root package name */
        boolean f9644c;

        /* renamed from: d, reason: collision with root package name */
        boolean f9645d;

        /* renamed from: e, reason: collision with root package name */
        int[] f9646e;

        /* renamed from: f, reason: collision with root package name */
        Set f9647f;

        /* renamed from: g, reason: collision with root package name */
        boolean f9648g;

        /* renamed from: h, reason: collision with root package name */
        int f9649h = -16711936;

        /* renamed from: i, reason: collision with root package name */
        int f9650i = 0;

        /* renamed from: j, reason: collision with root package name */
        e f9651j = new androidx.emoji2.text.e();

        protected c(h hVar) {
            y0.i.h(hVar, "metadataLoader cannot be null.");
            this.f9642a = hVar;
        }

        protected final h a() {
            return this.f9642a;
        }

        public c b(int i8) {
            this.f9650i = i8;
            return this;
        }
    }

    public static class d implements j {
        @Override // androidx.emoji2.text.f.j
        public androidx.emoji2.text.j a(p pVar) {
            return new q(pVar);
        }
    }

    public interface e {
        boolean a(CharSequence charSequence, int i8, int i9, int i10);
    }

    /* renamed from: androidx.emoji2.text.f$f, reason: collision with other inner class name */
    public static abstract class AbstractC0161f {
        public void a(Throwable th) {
        }

        public void b() {
        }
    }

    private static class g implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        private final List f9652o;

        /* renamed from: s, reason: collision with root package name */
        private final Throwable f9653s;

        /* renamed from: t, reason: collision with root package name */
        private final int f9654t;

        g(AbstractC0161f abstractC0161f, int i8) {
            this(Arrays.asList((AbstractC0161f) y0.i.h(abstractC0161f, "initCallback cannot be null")), i8, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f9652o.size();
            int i8 = 0;
            if (this.f9654t != 1) {
                while (i8 < size) {
                    ((AbstractC0161f) this.f9652o.get(i8)).a(this.f9653s);
                    i8++;
                }
            } else {
                while (i8 < size) {
                    ((AbstractC0161f) this.f9652o.get(i8)).b();
                    i8++;
                }
            }
        }

        g(Collection collection, int i8) {
            this(collection, i8, null);
        }

        g(Collection collection, int i8, Throwable th) {
            y0.i.h(collection, "initCallbacks cannot be null");
            this.f9652o = new ArrayList(collection);
            this.f9654t = i8;
            this.f9653s = th;
        }
    }

    public interface h {
        void a(i iVar);
    }

    public static abstract class i {
        public abstract void a(Throwable th);

        public abstract void b(n nVar);
    }

    public interface j {
        androidx.emoji2.text.j a(p pVar);
    }

    private f(c cVar) {
        this.f9631h = cVar.f9644c;
        this.f9632i = cVar.f9645d;
        this.f9633j = cVar.f9646e;
        this.f9634k = cVar.f9648g;
        this.f9635l = cVar.f9649h;
        this.f9629f = cVar.f9642a;
        this.f9636m = cVar.f9650i;
        this.f9637n = cVar.f9651j;
        C6398b c6398b = new C6398b();
        this.f9625b = c6398b;
        j jVar = cVar.f9643b;
        this.f9630g = jVar == null ? new d() : jVar;
        Set set = cVar.f9647f;
        if (set != null && !set.isEmpty()) {
            c6398b.addAll(cVar.f9647f);
        }
        this.f9628e = new a(this);
        m();
    }

    public static f c() {
        f fVar;
        synchronized (f9621o) {
            fVar = f9623q;
            y0.i.i(fVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return fVar;
    }

    public static boolean f(InputConnection inputConnection, Editable editable, int i8, int i9, boolean z7) {
        return androidx.emoji2.text.i.b(inputConnection, editable, i8, i9, z7);
    }

    public static boolean g(Editable editable, int i8, KeyEvent keyEvent) {
        return androidx.emoji2.text.i.c(editable, i8, keyEvent);
    }

    public static f h(c cVar) {
        f fVar = f9623q;
        if (fVar == null) {
            synchronized (f9621o) {
                try {
                    fVar = f9623q;
                    if (fVar == null) {
                        fVar = new f(cVar);
                        f9623q = fVar;
                    }
                } finally {
                }
            }
        }
        return fVar;
    }

    public static boolean i() {
        return f9623q != null;
    }

    private boolean k() {
        return e() == 1;
    }

    private void m() {
        this.f9624a.writeLock().lock();
        try {
            if (this.f9636m == 0) {
                this.f9626c = 0;
            }
            this.f9624a.writeLock().unlock();
            if (e() == 0) {
                this.f9628e.a();
            }
        } catch (Throwable th) {
            this.f9624a.writeLock().unlock();
            throw th;
        }
    }

    public int d() {
        return this.f9635l;
    }

    public int e() {
        this.f9624a.readLock().lock();
        try {
            return this.f9626c;
        } finally {
            this.f9624a.readLock().unlock();
        }
    }

    public boolean j() {
        return this.f9634k;
    }

    public void l() {
        y0.i.i(this.f9636m == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (k()) {
            return;
        }
        this.f9624a.writeLock().lock();
        try {
            if (this.f9626c == 0) {
                return;
            }
            this.f9626c = 0;
            this.f9624a.writeLock().unlock();
            this.f9628e.a();
        } finally {
            this.f9624a.writeLock().unlock();
        }
    }

    void n(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f9624a.writeLock().lock();
        try {
            this.f9626c = 2;
            arrayList.addAll(this.f9625b);
            this.f9625b.clear();
            this.f9624a.writeLock().unlock();
            this.f9627d.post(new g(arrayList, this.f9626c, th));
        } catch (Throwable th2) {
            this.f9624a.writeLock().unlock();
            throw th2;
        }
    }

    void o() {
        ArrayList arrayList = new ArrayList();
        this.f9624a.writeLock().lock();
        try {
            this.f9626c = 1;
            arrayList.addAll(this.f9625b);
            this.f9625b.clear();
            this.f9624a.writeLock().unlock();
            this.f9627d.post(new g(arrayList, this.f9626c));
        } catch (Throwable th) {
            this.f9624a.writeLock().unlock();
            throw th;
        }
    }

    public CharSequence p(CharSequence charSequence) {
        return q(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence q(CharSequence charSequence, int i8, int i9) {
        return r(charSequence, i8, i9, Integer.MAX_VALUE);
    }

    public CharSequence r(CharSequence charSequence, int i8, int i9, int i10) {
        return s(charSequence, i8, i9, i10, 0);
    }

    public CharSequence s(CharSequence charSequence, int i8, int i9, int i10, int i11) {
        boolean z7;
        y0.i.i(k(), "Not initialized yet");
        y0.i.e(i8, "start cannot be negative");
        y0.i.e(i9, "end cannot be negative");
        y0.i.e(i10, "maxEmojiCount cannot be negative");
        y0.i.b(i8 <= i9, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        y0.i.b(i8 <= charSequence.length(), "start should be < than charSequence length");
        y0.i.b(i9 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i8 == i9) {
            return charSequence;
        }
        if (i11 != 1) {
            z7 = i11 != 2 ? this.f9631h : false;
        } else {
            z7 = true;
        }
        return this.f9628e.b(charSequence, i8, i9, i10, z7);
    }

    public void t(AbstractC0161f abstractC0161f) {
        y0.i.h(abstractC0161f, "initCallback cannot be null");
        this.f9624a.writeLock().lock();
        try {
            if (this.f9626c == 1 || this.f9626c == 2) {
                this.f9627d.post(new g(abstractC0161f, this.f9626c));
            } else {
                this.f9625b.add(abstractC0161f);
            }
            this.f9624a.writeLock().unlock();
        } catch (Throwable th) {
            this.f9624a.writeLock().unlock();
            throw th;
        }
    }

    public void u(AbstractC0161f abstractC0161f) {
        y0.i.h(abstractC0161f, "initCallback cannot be null");
        this.f9624a.writeLock().lock();
        try {
            this.f9625b.remove(abstractC0161f);
        } finally {
            this.f9624a.writeLock().unlock();
        }
    }

    public void v(EditorInfo editorInfo) {
        if (!k() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f9628e.c(editorInfo);
    }
}
