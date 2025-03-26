package T2;

import Z2.r;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* loaded from: classes.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static final Lock f5177c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    private static a f5178d;

    /* renamed from: a, reason: collision with root package name */
    private final Lock f5179a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f5180b;

    a(Context context) {
        this.f5180b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static a a(Context context) {
        r.l(context);
        Lock lock = f5177c;
        lock.lock();
        try {
            if (f5178d == null) {
                f5178d = new a(context.getApplicationContext());
            }
            a aVar = f5178d;
            lock.unlock();
            return aVar;
        } catch (Throwable th) {
            f5177c.unlock();
            throw th;
        }
    }

    private static final String d(String str, String str2) {
        return str + ":" + str2;
    }

    public GoogleSignInAccount b() {
        String c8;
        String c9 = c("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(c9) || (c8 = c(d("googleSignInAccount", c9))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.I0(c8);
        } catch (JSONException unused) {
            return null;
        }
    }

    protected final String c(String str) {
        this.f5179a.lock();
        try {
            return this.f5180b.getString(str, null);
        } finally {
            this.f5179a.unlock();
        }
    }
}
