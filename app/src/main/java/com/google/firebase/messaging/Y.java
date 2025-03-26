package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class Y {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f32899a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32900b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32901c;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f32903e;

    /* renamed from: d, reason: collision with root package name */
    final ArrayDeque f32902d = new ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    private boolean f32904f = false;

    private Y(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f32899a = sharedPreferences;
        this.f32900b = str;
        this.f32901c = str2;
        this.f32903e = executor;
    }

    private boolean b(boolean z7) {
        if (z7 && !this.f32904f) {
            i();
        }
        return z7;
    }

    static Y c(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        Y y7 = new Y(sharedPreferences, str, str2, executor);
        y7.d();
        return y7;
    }

    private void d() {
        synchronized (this.f32902d) {
            try {
                this.f32902d.clear();
                String string = this.f32899a.getString(this.f32900b, "");
                if (!TextUtils.isEmpty(string) && string.contains(this.f32901c)) {
                    String[] split = string.split(this.f32901c, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            this.f32902d.add(str);
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        synchronized (this.f32902d) {
            this.f32899a.edit().putString(this.f32900b, g()).commit();
        }
    }

    private void i() {
        this.f32903e.execute(new Runnable() { // from class: com.google.firebase.messaging.X
            @Override // java.lang.Runnable
            public final void run() {
                this.f32898o.h();
            }
        });
    }

    public String e() {
        String str;
        synchronized (this.f32902d) {
            str = (String) this.f32902d.peek();
        }
        return str;
    }

    public boolean f(Object obj) {
        boolean b8;
        synchronized (this.f32902d) {
            b8 = b(this.f32902d.remove(obj));
        }
        return b8;
    }

    public String g() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f32902d.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(this.f32901c);
        }
        return sb.toString();
    }
}
