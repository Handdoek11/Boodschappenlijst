package Z2;

import android.accounts.Account;
import android.view.View;
import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import q.C6398b;
import x3.C6908a;

/* renamed from: Z2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0766e {

    /* renamed from: a, reason: collision with root package name */
    private final Account f6312a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f6313b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f6314c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f6315d;

    /* renamed from: e, reason: collision with root package name */
    private final int f6316e;

    /* renamed from: f, reason: collision with root package name */
    private final View f6317f;

    /* renamed from: g, reason: collision with root package name */
    private final String f6318g;

    /* renamed from: h, reason: collision with root package name */
    private final String f6319h;

    /* renamed from: i, reason: collision with root package name */
    private final C6908a f6320i;

    /* renamed from: j, reason: collision with root package name */
    private Integer f6321j;

    /* renamed from: Z2.e$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Account f6322a;

        /* renamed from: b, reason: collision with root package name */
        private C6398b f6323b;

        /* renamed from: c, reason: collision with root package name */
        private String f6324c;

        /* renamed from: d, reason: collision with root package name */
        private String f6325d;

        /* renamed from: e, reason: collision with root package name */
        private final C6908a f6326e = C6908a.f44430k;

        public C0766e a() {
            return new C0766e(this.f6322a, this.f6323b, null, 0, null, this.f6324c, this.f6325d, this.f6326e, false);
        }

        public a b(String str) {
            this.f6324c = str;
            return this;
        }

        public final a c(Collection collection) {
            if (this.f6323b == null) {
                this.f6323b = new C6398b();
            }
            this.f6323b.addAll(collection);
            return this;
        }

        public final a d(Account account) {
            this.f6322a = account;
            return this;
        }

        public final a e(String str) {
            this.f6325d = str;
            return this;
        }
    }

    public C0766e(Account account, Set set, Map map, int i8, View view, String str, String str2, C6908a c6908a, boolean z7) {
        this.f6312a = account;
        Set emptySet = set == null ? Collections.emptySet() : DesugarCollections.unmodifiableSet(set);
        this.f6313b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f6315d = map;
        this.f6317f = view;
        this.f6316e = i8;
        this.f6318g = str;
        this.f6319h = str2;
        this.f6320i = c6908a == null ? C6908a.f44430k : c6908a;
        HashSet hashSet = new HashSet(emptySet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.E.a(it.next());
            throw null;
        }
        this.f6314c = DesugarCollections.unmodifiableSet(hashSet);
    }

    public Account a() {
        return this.f6312a;
    }

    public Account b() {
        Account account = this.f6312a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    public Set c() {
        return this.f6314c;
    }

    public String d() {
        return this.f6318g;
    }

    public Set e() {
        return this.f6313b;
    }

    public final C6908a f() {
        return this.f6320i;
    }

    public final Integer g() {
        return this.f6321j;
    }

    public final String h() {
        return this.f6319h;
    }

    public final void i(Integer num) {
        this.f6321j = num;
    }
}
