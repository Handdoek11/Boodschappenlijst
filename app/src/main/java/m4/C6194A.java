package m4;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p4.AbstractC6384F;
import v4.C6840e;
import v4.InterfaceC6839d;

/* renamed from: m4.A, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6194A {

    /* renamed from: g, reason: collision with root package name */
    private static final Map f38968g;

    /* renamed from: h, reason: collision with root package name */
    static final String f38969h;

    /* renamed from: a, reason: collision with root package name */
    private final Context f38970a;

    /* renamed from: b, reason: collision with root package name */
    private final J f38971b;

    /* renamed from: c, reason: collision with root package name */
    private final C6195a f38972c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6839d f38973d;

    /* renamed from: e, reason: collision with root package name */
    private final u4.j f38974e;

    /* renamed from: f, reason: collision with root package name */
    private final j4.j f38975f = j4.j.f38249a;

    static {
        HashMap hashMap = new HashMap();
        f38968g = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
        f38969h = String.format(Locale.US, "Crashlytics Android SDK/%s", "19.3.0");
    }

    public C6194A(Context context, J j8, C6195a c6195a, InterfaceC6839d interfaceC6839d, u4.j jVar) {
        this.f38970a = context;
        this.f38971b = j8;
        this.f38972c = c6195a;
        this.f38973d = interfaceC6839d;
        this.f38974e = jVar;
    }

    private AbstractC6384F.e.d.a.c A(AbstractC6384F.a aVar) {
        return this.f38975f.a(aVar.e(), aVar.d(), aVar.c());
    }

    private AbstractC6384F.a a(AbstractC6384F.a aVar) {
        List list;
        if (!this.f38974e.b().f43972b.f43981c || this.f38972c.f39022c.size() <= 0) {
            list = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (C6200f c6200f : this.f38972c.f39022c) {
                arrayList.add(AbstractC6384F.a.AbstractC0302a.a().d(c6200f.c()).b(c6200f.a()).c(c6200f.b()).a());
            }
            list = DesugarCollections.unmodifiableList(arrayList);
        }
        return AbstractC6384F.a.a().c(aVar.c()).e(aVar.e()).g(aVar.g()).i(aVar.i()).d(aVar.d()).f(aVar.f()).h(aVar.h()).j(aVar.j()).b(list).a();
    }

    private AbstractC6384F.b b() {
        return AbstractC6384F.b().l("19.3.0").h(this.f38972c.f39020a).i(this.f38971b.a().c()).g(this.f38971b.a().e()).f(this.f38971b.a().d()).d(this.f38972c.f39025f).e(this.f38972c.f39026g).k(4);
    }

    private static long f(long j8) {
        if (j8 > 0) {
            return j8;
        }
        return 0L;
    }

    private static int g() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = (Integer) f38968g.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    private AbstractC6384F.e.d.a.b.AbstractC0306a h() {
        return AbstractC6384F.e.d.a.b.AbstractC0306a.a().b(0L).d(0L).c(this.f38972c.f39024e).e(this.f38972c.f39021b).a();
    }

    private List i() {
        return Collections.singletonList(h());
    }

    private AbstractC6384F.e.d.a j(int i8, AbstractC6384F.a aVar) {
        return AbstractC6384F.e.d.a.a().c(Boolean.valueOf(aVar.c() != 100)).d(A(aVar)).h(i8).f(o(aVar)).a();
    }

    private AbstractC6384F.e.d.a k(int i8, C6840e c6840e, Thread thread, int i9, int i10, boolean z7) {
        Boolean bool;
        AbstractC6384F.e.d.a.c e8 = this.f38975f.e(this.f38970a);
        if (e8.b() > 0) {
            bool = Boolean.valueOf(e8.b() != 100);
        } else {
            bool = null;
        }
        return AbstractC6384F.e.d.a.a().c(bool).d(e8).b(this.f38975f.d(this.f38970a)).h(i8).f(p(c6840e, thread, i9, i10, z7)).a();
    }

    private AbstractC6384F.e.d.c l(int i8) {
        C6199e a8 = C6199e.a(this.f38970a);
        Float b8 = a8.b();
        Double valueOf = b8 != null ? Double.valueOf(b8.doubleValue()) : null;
        int c8 = a8.c();
        boolean n8 = AbstractC6203i.n(this.f38970a);
        return AbstractC6384F.e.d.c.a().b(valueOf).c(c8).f(n8).e(i8).g(f(AbstractC6203i.b(this.f38970a) - AbstractC6203i.a(this.f38970a))).d(AbstractC6203i.c(Environment.getDataDirectory().getPath())).a();
    }

    private AbstractC6384F.e.d.a.b.c m(C6840e c6840e, int i8, int i9) {
        return n(c6840e, i8, i9, 0);
    }

    private AbstractC6384F.e.d.a.b.c n(C6840e c6840e, int i8, int i9, int i10) {
        String str = c6840e.f44091b;
        String str2 = c6840e.f44090a;
        StackTraceElement[] stackTraceElementArr = c6840e.f44092c;
        int i11 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        C6840e c6840e2 = c6840e.f44093d;
        if (i10 >= i9) {
            C6840e c6840e3 = c6840e2;
            while (c6840e3 != null) {
                c6840e3 = c6840e3.f44093d;
                i11++;
            }
        }
        AbstractC6384F.e.d.a.b.c.AbstractC0309a d8 = AbstractC6384F.e.d.a.b.c.a().f(str).e(str2).c(r(stackTraceElementArr, i8)).d(i11);
        if (c6840e2 != null && i11 == 0) {
            d8.b(n(c6840e2, i8, i9, i10 + 1));
        }
        return d8.a();
    }

    private AbstractC6384F.e.d.a.b o(AbstractC6384F.a aVar) {
        return AbstractC6384F.e.d.a.b.a().b(aVar).e(w()).c(i()).a();
    }

    private AbstractC6384F.e.d.a.b p(C6840e c6840e, Thread thread, int i8, int i9, boolean z7) {
        return AbstractC6384F.e.d.a.b.a().f(z(c6840e, thread, i8, z7)).d(m(c6840e, i8, i9)).e(w()).c(i()).a();
    }

    private AbstractC6384F.e.d.a.b.AbstractC0312e.AbstractC0314b q(StackTraceElement stackTraceElement, AbstractC6384F.e.d.a.b.AbstractC0312e.AbstractC0314b.AbstractC0315a abstractC0315a) {
        long j8 = 0;
        long max = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            j8 = stackTraceElement.getLineNumber();
        }
        return abstractC0315a.e(max).f(str).b(fileName).d(j8).a();
    }

    private List r(StackTraceElement[] stackTraceElementArr, int i8) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(q(stackTraceElement, AbstractC6384F.e.d.a.b.AbstractC0312e.AbstractC0314b.a().c(i8)));
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    private AbstractC6384F.e.a s() {
        return AbstractC6384F.e.a.a().e(this.f38971b.f()).g(this.f38972c.f39025f).d(this.f38972c.f39026g).f(this.f38971b.a().c()).b(this.f38972c.f39027h.d()).c(this.f38972c.f39027h.e()).a();
    }

    private AbstractC6384F.e t(String str, long j8) {
        return AbstractC6384F.e.a().m(j8).j(str).h(f38969h).b(s()).l(v()).e(u()).i(3).a();
    }

    private AbstractC6384F.e.c u() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int g8 = g();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long b8 = AbstractC6203i.b(this.f38970a);
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        boolean w7 = AbstractC6203i.w();
        int l8 = AbstractC6203i.l();
        return AbstractC6384F.e.c.a().b(g8).f(Build.MODEL).c(availableProcessors).h(b8).d(blockCount).i(w7).j(l8).e(Build.MANUFACTURER).g(Build.PRODUCT).a();
    }

    private AbstractC6384F.e.AbstractC0319e v() {
        return AbstractC6384F.e.AbstractC0319e.a().d(3).e(Build.VERSION.RELEASE).b(Build.VERSION.CODENAME).c(AbstractC6203i.x()).a();
    }

    private AbstractC6384F.e.d.a.b.AbstractC0310d w() {
        return AbstractC6384F.e.d.a.b.AbstractC0310d.a().d("0").c("0").b(0L).a();
    }

    private AbstractC6384F.e.d.a.b.AbstractC0312e x(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return y(thread, stackTraceElementArr, 0);
    }

    private AbstractC6384F.e.d.a.b.AbstractC0312e y(Thread thread, StackTraceElement[] stackTraceElementArr, int i8) {
        return AbstractC6384F.e.d.a.b.AbstractC0312e.a().d(thread.getName()).c(i8).b(r(stackTraceElementArr, i8)).a();
    }

    private List z(C6840e c6840e, Thread thread, int i8, boolean z7) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(y(thread, c6840e.f44092c, i8));
        if (z7) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(x(key, this.f38973d.a(entry.getValue())));
                }
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public AbstractC6384F.e.d c(AbstractC6384F.a aVar) {
        int i8 = this.f38970a.getResources().getConfiguration().orientation;
        return AbstractC6384F.e.d.a().g("anr").f(aVar.i()).b(j(i8, a(aVar))).c(l(i8)).a();
    }

    public AbstractC6384F.e.d d(Throwable th, Thread thread, String str, long j8, int i8, int i9, boolean z7) {
        int i10 = this.f38970a.getResources().getConfiguration().orientation;
        return AbstractC6384F.e.d.a().g(str).f(j8).b(k(i10, C6840e.a(th, this.f38973d), thread, i8, i9, z7)).c(l(i10)).a();
    }

    public AbstractC6384F e(String str, long j8) {
        return b().m(t(str, j8)).a();
    }
}
