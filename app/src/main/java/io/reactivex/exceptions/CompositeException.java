package io.reactivex.exceptions;

import j$.util.DesugarCollections;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes2.dex */
public final class CompositeException extends RuntimeException {

    /* renamed from: o, reason: collision with root package name */
    private final List f36987o;

    /* renamed from: s, reason: collision with root package name */
    private final String f36988s;

    /* renamed from: t, reason: collision with root package name */
    private Throwable f36989t;

    static final class a extends RuntimeException {
        a() {
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    static abstract class b {
        b() {
        }

        abstract void a(Object obj);
    }

    static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        private final PrintStream f36990a;

        c(PrintStream printStream) {
            this.f36990a = printStream;
        }

        @Override // io.reactivex.exceptions.CompositeException.b
        void a(Object obj) {
            this.f36990a.println(obj);
        }
    }

    static final class d extends b {

        /* renamed from: a, reason: collision with root package name */
        private final PrintWriter f36991a;

        d(PrintWriter printWriter) {
            this.f36991a = printWriter;
        }

        @Override // io.reactivex.exceptions.CompositeException.b
        void a(Object obj) {
            this.f36991a.println(obj);
        }
    }

    public CompositeException(Throwable... thArr) {
        this(thArr == null ? Collections.singletonList(new NullPointerException("exceptions was null")) : Arrays.asList(thArr));
    }

    private void a(StringBuilder sb, Throwable th, String str) {
        sb.append(str);
        sb.append(th);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            a(sb, th.getCause(), "");
        }
    }

    private List c(Throwable th) {
        ArrayList arrayList = new ArrayList();
        Throwable cause = th.getCause();
        if (cause != null && cause != th) {
            while (true) {
                arrayList.add(cause);
                Throwable cause2 = cause.getCause();
                if (cause2 == null || cause2 == cause) {
                    break;
                }
                cause = cause2;
            }
        }
        return arrayList;
    }

    private void e(b bVar) {
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        int i8 = 1;
        for (Throwable th : this.f36987o) {
            sb.append("  ComposedException ");
            sb.append(i8);
            sb.append(" :\n");
            a(sb, th, "\t");
            i8++;
        }
        bVar.a(sb.toString());
    }

    public List b() {
        return this.f36987o;
    }

    Throwable d(Throwable th) {
        Throwable cause = th.getCause();
        if (cause == null || th == cause) {
            return th;
        }
        while (true) {
            Throwable cause2 = cause.getCause();
            if (cause2 == null || cause2 == cause) {
                break;
            }
            cause = cause2;
        }
        return cause;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        try {
            if (this.f36989t == null) {
                a aVar = new a();
                HashSet hashSet = new HashSet();
                Throwable th = aVar;
                for (Throwable th2 : this.f36987o) {
                    if (!hashSet.contains(th2)) {
                        hashSet.add(th2);
                        for (Throwable th3 : c(th2)) {
                            if (hashSet.contains(th3)) {
                                th2 = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                            } else {
                                hashSet.add(th3);
                            }
                        }
                        try {
                            th.initCause(th2);
                        } catch (Throwable unused) {
                        }
                        th = d(th);
                    }
                }
                this.f36989t = aVar;
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return this.f36989t;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f36988s;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        e(new c(printStream));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        e(new d(printWriter));
    }

    public CompositeException(Iterable iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Throwable th = (Throwable) it.next();
                if (th instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th).b());
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            List unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
            this.f36987o = unmodifiableList;
            this.f36988s = unmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }
}
