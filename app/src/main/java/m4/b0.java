package m4;

import A3.AbstractC0376j;
import A3.AbstractC0379m;
import A3.InterfaceC0369c;
import android.app.ApplicationExitInfo;
import android.content.Context;
import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import p4.AbstractC6384F;
import t4.C6795b;
import v4.InterfaceC6839d;

/* loaded from: classes2.dex */
public class b0 {

    /* renamed from: a, reason: collision with root package name */
    private final C6194A f39035a;

    /* renamed from: b, reason: collision with root package name */
    private final s4.e f39036b;

    /* renamed from: c, reason: collision with root package name */
    private final C6795b f39037c;

    /* renamed from: d, reason: collision with root package name */
    private final o4.e f39038d;

    /* renamed from: e, reason: collision with root package name */
    private final o4.n f39039e;

    /* renamed from: f, reason: collision with root package name */
    private final J f39040f;

    /* renamed from: g, reason: collision with root package name */
    private final n4.f f39041g;

    b0(C6194A c6194a, s4.e eVar, C6795b c6795b, o4.e eVar2, o4.n nVar, J j8, n4.f fVar) {
        this.f39035a = c6194a;
        this.f39036b = eVar;
        this.f39037c = c6795b;
        this.f39038d = eVar2;
        this.f39039e = nVar;
        this.f39040f = j8;
        this.f39041g = fVar;
    }

    private AbstractC6384F.e.d d(AbstractC6384F.e.d dVar, o4.e eVar, o4.n nVar) {
        AbstractC6384F.e.d.b h8 = dVar.h();
        String c8 = eVar.c();
        if (c8 != null) {
            h8.d(AbstractC6384F.e.d.AbstractC0317d.a().b(c8).a());
        } else {
            j4.g.f().i("No log data to include with this event.");
        }
        List n8 = n(nVar.f());
        List n9 = n(nVar.g());
        if (!n8.isEmpty() || !n9.isEmpty()) {
            h8.b(dVar.b().i().e(n8).g(n9).a());
        }
        return h8.a();
    }

    private AbstractC6384F.e.d e(AbstractC6384F.e.d dVar) {
        return f(d(dVar, this.f39038d, this.f39039e), this.f39039e);
    }

    private AbstractC6384F.e.d f(AbstractC6384F.e.d dVar, o4.n nVar) {
        List h8 = nVar.h();
        if (h8.isEmpty()) {
            return dVar;
        }
        AbstractC6384F.e.d.b h9 = dVar.h();
        h9.e(AbstractC6384F.e.d.f.a().b(h8).a());
        return h9.a();
    }

    private static AbstractC6384F.a g(ApplicationExitInfo applicationExitInfo) {
        String str = null;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                str = h(traceInputStream);
            }
        } catch (IOException e8) {
            j4.g.f().k("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e8);
        }
        return AbstractC6384F.a.a().c(applicationExitInfo.getImportance()).e(applicationExitInfo.getProcessName()).g(applicationExitInfo.getReason()).i(applicationExitInfo.getTimestamp()).d(applicationExitInfo.getPid()).f(applicationExitInfo.getPss()).h(applicationExitInfo.getRss()).j(str).a();
    }

    public static String h(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static b0 i(Context context, J j8, s4.g gVar, C6195a c6195a, o4.e eVar, o4.n nVar, InterfaceC6839d interfaceC6839d, u4.j jVar, O o8, C6207m c6207m, n4.f fVar) {
        return new b0(new C6194A(context, j8, c6195a, interfaceC6839d, jVar), new s4.e(gVar, jVar, c6207m), C6795b.b(context, jVar, o8), eVar, nVar, j8, fVar);
    }

    private B j(B b8) {
        if (b8.b().h() != null && b8.b().g() != null) {
            return b8;
        }
        I d8 = this.f39040f.d(true);
        return B.a(b8.b().t(d8.b()).s(d8.a()), b8.d(), b8.c());
    }

    private ApplicationExitInfo m(String str, List list) {
        long q8 = this.f39036b.q(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo a8 = B1.d.a(it.next());
            if (a8.getTimestamp() < q8) {
                return null;
            }
            if (a8.getReason() == 6) {
                return a8;
            }
        }
        return null;
    }

    private static List n(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(AbstractC6384F.c.a().b((String) entry.getKey()).c((String) entry.getValue()).a());
        }
        Collections.sort(arrayList, new Comparator() { // from class: m4.Y
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return b0.p((AbstractC6384F.c) obj, (AbstractC6384F.c) obj2);
            }
        });
        return DesugarCollections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int p(AbstractC6384F.c cVar, AbstractC6384F.c cVar2) {
        return cVar.b().compareTo(cVar2.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(AbstractC6384F.e.d dVar, String str, boolean z7) {
        j4.g.f().b("disk worker: log non-fatal event to persistence");
        this.f39036b.y(dVar, str, z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean t(AbstractC0376j abstractC0376j) {
        if (!abstractC0376j.s()) {
            j4.g.f().l("Crashlytics report could not be enqueued to DataTransport", abstractC0376j.n());
            return false;
        }
        B b8 = (B) abstractC0376j.o();
        j4.g.f().b("Crashlytics report successfully enqueued to DataTransport: " + b8.d());
        File c8 = b8.c();
        if (c8.delete()) {
            j4.g.f().b("Deleted report file: " + c8.getPath());
            return true;
        }
        j4.g.f().k("Crashlytics could not delete report file: " + c8.getPath());
        return true;
    }

    private void u(Throwable th, Thread thread, final String str, String str2, long j8, boolean z7) {
        final boolean equals = str2.equals("crash");
        final AbstractC6384F.e.d e8 = e(this.f39035a.d(th, thread, str2, j8, 4, 8, z7));
        if (z7) {
            this.f39036b.y(e8, str, equals);
        } else {
            this.f39041g.f39587b.f(new Runnable() { // from class: m4.a0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39028o.q(e8, str, equals);
                }
            });
        }
    }

    public AbstractC0376j A(Executor executor, String str) {
        List<B> w7 = this.f39036b.w();
        ArrayList arrayList = new ArrayList();
        for (B b8 : w7) {
            if (str == null || str.equals(b8.d())) {
                arrayList.add(this.f39037c.c(j(b8), str != null).k(executor, new InterfaceC0369c() { // from class: m4.Z
                    @Override // A3.InterfaceC0369c
                    public final Object a(AbstractC0376j abstractC0376j) {
                        return Boolean.valueOf(this.f39019a.t(abstractC0376j));
                    }
                }));
            }
        }
        return AbstractC0379m.f(arrayList);
    }

    public void k(String str, List list, AbstractC6384F.a aVar) {
        j4.g.f().b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC6384F.d.b c8 = ((M) it.next()).c();
            if (c8 != null) {
                arrayList.add(c8);
            }
        }
        this.f39036b.l(str, AbstractC6384F.d.a().b(DesugarCollections.unmodifiableList(arrayList)).a(), aVar);
    }

    public void l(long j8, String str) {
        this.f39036b.k(str, j8);
    }

    public boolean o() {
        return this.f39036b.r();
    }

    public SortedSet r() {
        return this.f39036b.p();
    }

    public void s(String str, long j8) {
        this.f39036b.z(this.f39035a.e(str, j8));
    }

    public void v(Throwable th, Thread thread, String str, long j8) {
        j4.g.f().i("Persisting fatal event for session " + str);
        u(th, thread, str, "crash", j8, true);
    }

    public void w(Throwable th, Thread thread, String str, long j8) {
        j4.g.f().i("Persisting non-fatal event for session " + str);
        u(th, thread, str, "error", j8, false);
    }

    public void x(String str, List list, o4.e eVar, o4.n nVar) {
        ApplicationExitInfo m8 = m(str, list);
        if (m8 == null) {
            j4.g.f().i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        AbstractC6384F.e.d c8 = this.f39035a.c(g(m8));
        j4.g.f().b("Persisting anr for session " + str);
        this.f39036b.y(f(d(c8, eVar, nVar), nVar), str, true);
    }

    public void y() {
        this.f39036b.i();
    }

    public AbstractC0376j z(Executor executor) {
        return A(executor, null);
    }
}
