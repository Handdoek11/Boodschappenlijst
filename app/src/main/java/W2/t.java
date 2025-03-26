package w2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class t {

    /* renamed from: f, reason: collision with root package name */
    public static final List f44300f = Arrays.asList("MA", "T", "PG", "G");

    /* renamed from: a, reason: collision with root package name */
    private final int f44301a;

    /* renamed from: b, reason: collision with root package name */
    private final int f44302b;

    /* renamed from: c, reason: collision with root package name */
    private final String f44303c;

    /* renamed from: d, reason: collision with root package name */
    private final List f44304d;

    /* renamed from: e, reason: collision with root package name */
    private final b f44305e;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f44306a = -1;

        /* renamed from: b, reason: collision with root package name */
        private int f44307b = -1;

        /* renamed from: c, reason: collision with root package name */
        private String f44308c = null;

        /* renamed from: d, reason: collision with root package name */
        private final List f44309d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        private b f44310e = b.DEFAULT;

        public t a() {
            return new t(this.f44306a, this.f44307b, this.f44308c, this.f44309d, this.f44310e, null);
        }
    }

    public enum b {
        DEFAULT(0),
        ENABLED(1),
        DISABLED(2);


        /* renamed from: o, reason: collision with root package name */
        private final int f44315o;

        b(int i8) {
            this.f44315o = i8;
        }

        public int a() {
            return this.f44315o;
        }
    }

    /* synthetic */ t(int i8, int i9, String str, List list, b bVar, AbstractC6874F abstractC6874F) {
        this.f44301a = i8;
        this.f44302b = i9;
        this.f44303c = str;
        this.f44304d = list;
        this.f44305e = bVar;
    }

    public String a() {
        String str = this.f44303c;
        return str == null ? "" : str;
    }

    public b b() {
        return this.f44305e;
    }

    public int c() {
        return this.f44301a;
    }

    public int d() {
        return this.f44302b;
    }

    public List e() {
        return new ArrayList(this.f44304d);
    }
}
