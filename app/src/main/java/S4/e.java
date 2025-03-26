package s4;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import m4.B;
import m4.C6207m;
import o4.n;
import p4.AbstractC6384F;
import q4.j;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: e, reason: collision with root package name */
    private static final Charset f42727e = Charset.forName("UTF-8");

    /* renamed from: f, reason: collision with root package name */
    private static final int f42728f = 15;

    /* renamed from: g, reason: collision with root package name */
    private static final j f42729g = new j();

    /* renamed from: h, reason: collision with root package name */
    private static final Comparator f42730h = new Comparator() { // from class: s4.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return e.u((File) obj, (File) obj2);
        }
    };

    /* renamed from: i, reason: collision with root package name */
    private static final FilenameFilter f42731i = new FilenameFilter() { // from class: s4.b
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return e.v(file, str);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f42732a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    private final g f42733b;

    /* renamed from: c, reason: collision with root package name */
    private final u4.j f42734c;

    /* renamed from: d, reason: collision with root package name */
    private final C6207m f42735d;

    public e(g gVar, u4.j jVar, C6207m c6207m) {
        this.f42733b = gVar;
        this.f42734c = jVar;
        this.f42735d = c6207m;
    }

    private static String A(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f42727e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    private void B(File file, AbstractC6384F.d dVar, String str, AbstractC6384F.a aVar) {
        String d8 = this.f42735d.d(str);
        try {
            j jVar = f42729g;
            F(this.f42733b.i(str), jVar.M(jVar.L(A(file)).u(dVar).q(aVar).p(d8)));
        } catch (IOException e8) {
            j4.g.f().l("Could not synthesize final native report file for " + file, e8);
        }
    }

    private void C(String str, long j8) {
        boolean z7;
        List<File> r8 = this.f42733b.r(str, f42731i);
        if (r8.isEmpty()) {
            j4.g.f().i("Session " + str + " has no events.");
            return;
        }
        Collections.sort(r8);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            z7 = false;
            for (File file : r8) {
                try {
                    arrayList.add(f42729g.j(A(file)));
                } catch (IOException e8) {
                    j4.g.f().l("Could not add event to report for " + file, e8);
                }
                if (z7 || s(file.getName())) {
                    z7 = true;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            D(this.f42733b.q(str, "report"), arrayList, j8, z7, n.l(str, this.f42733b), this.f42735d.d(str));
        } else {
            j4.g.f().k("Could not parse event files for session " + str);
        }
    }

    private void D(File file, List list, long j8, boolean z7, String str, String str2) {
        try {
            j jVar = f42729g;
            AbstractC6384F r8 = jVar.L(A(file)).v(j8, z7, str).p(str2).r(list);
            AbstractC6384F.e n8 = r8.n();
            if (n8 == null) {
                return;
            }
            j4.g.f().b("appQualitySessionId: " + str2);
            F(z7 ? this.f42733b.l(n8.i()) : this.f42733b.n(n8.i()), jVar.M(r8));
        } catch (IOException e8) {
            j4.g.f().l("Could not synthesize final report file for " + file, e8);
        }
    }

    private int E(String str, int i8) {
        List r8 = this.f42733b.r(str, new FilenameFilter() { // from class: s4.c
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return e.t(file, str2);
            }
        });
        Collections.sort(r8, new Comparator() { // from class: s4.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return e.x((File) obj, (File) obj2);
            }
        });
        return f(r8, i8);
    }

    private static void F(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f42727e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static void G(File file, String str, long j8) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f42727e);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(h(j8));
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private SortedSet e(String str) {
        this.f42733b.d();
        SortedSet p8 = p();
        if (str != null) {
            p8.remove(str);
        }
        if (p8.size() <= 8) {
            return p8;
        }
        while (p8.size() > 8) {
            String str2 = (String) p8.last();
            j4.g.f().b("Removing session over cap: " + str2);
            this.f42733b.e(str2);
            p8.remove(str2);
        }
        return p8;
    }

    private static int f(List list, int i8) {
        int size = list.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (size <= i8) {
                return size;
            }
            g.v(file);
            size--;
        }
        return size;
    }

    private void g() {
        int i8 = this.f42734c.b().f43971a.f43983b;
        List n8 = n();
        int size = n8.size();
        if (size <= i8) {
            return;
        }
        Iterator it = n8.subList(i8, size).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    private static long h(long j8) {
        return j8 * 1000;
    }

    private void j(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    private static String m(int i8, boolean z7) {
        return "event" + String.format(Locale.US, "%010d", Integer.valueOf(i8)) + (z7 ? "_" : "");
    }

    private List n() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f42733b.m());
        arrayList.addAll(this.f42733b.j());
        Comparator comparator = f42730h;
        Collections.sort(arrayList, comparator);
        List o8 = this.f42733b.o();
        Collections.sort(o8, comparator);
        arrayList.addAll(o8);
        return arrayList;
    }

    private static String o(String str) {
        return str.substring(0, f42728f);
    }

    private static boolean s(String str) {
        return str.startsWith("event") && str.endsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean t(File file, String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int u(File file, File file2) {
        return file2.getName().compareTo(file.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean v(File file, String str) {
        return str.startsWith("event");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int x(File file, File file2) {
        return o(file.getName()).compareTo(o(file2.getName()));
    }

    public void i() {
        j(this.f42733b.o());
        j(this.f42733b.m());
        j(this.f42733b.j());
    }

    public void k(String str, long j8) {
        for (String str2 : e(str)) {
            j4.g.f().i("Finalizing report for session " + str2);
            C(str2, j8);
            this.f42733b.e(str2);
        }
        g();
    }

    public void l(String str, AbstractC6384F.d dVar, AbstractC6384F.a aVar) {
        File q8 = this.f42733b.q(str, "report");
        j4.g.f().b("Writing native session report for " + str + " to file: " + q8);
        B(q8, dVar, str, aVar);
    }

    public SortedSet p() {
        return new TreeSet(this.f42733b.f()).descendingSet();
    }

    public long q(String str) {
        return this.f42733b.q(str, "start-time").lastModified();
    }

    public boolean r() {
        return (this.f42733b.o().isEmpty() && this.f42733b.m().isEmpty() && this.f42733b.j().isEmpty()) ? false : true;
    }

    public List w() {
        List<File> n8 = n();
        ArrayList arrayList = new ArrayList();
        for (File file : n8) {
            try {
                arrayList.add(B.a(f42729g.L(A(file)), file.getName(), file));
            } catch (IOException e8) {
                j4.g.f().l("Could not load report file " + file + "; deleting", e8);
                file.delete();
            }
        }
        return arrayList;
    }

    public void y(AbstractC6384F.e.d dVar, String str, boolean z7) {
        int i8 = this.f42734c.b().f43971a.f43982a;
        try {
            F(this.f42733b.q(str, m(this.f42732a.getAndIncrement(), z7)), f42729g.k(dVar));
        } catch (IOException e8) {
            j4.g.f().l("Could not persist event for session " + str, e8);
        }
        E(str, i8);
    }

    public void z(AbstractC6384F abstractC6384F) {
        AbstractC6384F.e n8 = abstractC6384F.n();
        if (n8 == null) {
            j4.g.f().b("Could not get session for report");
            return;
        }
        String i8 = n8.i();
        try {
            F(this.f42733b.q(i8, "report"), f42729g.M(abstractC6384F));
            G(this.f42733b.q(i8, "start-time"), "", n8.l());
        } catch (IOException e8) {
            j4.g.f().c("Could not persist report for session " + i8, e8);
        }
    }
}
