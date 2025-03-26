package p3;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class U0 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f40210a;

    U0(Executor executor) {
        this.f40210a = executor;
    }

    public final Executor a() {
        return this.f40210a;
    }

    public final void b(final String str, final String str2, final E0... e0Arr) {
        this.f40210a.execute(new Runnable() { // from class: p3.d0
            @Override // java.lang.Runnable
            public final void run() {
                final JSONObject jSONObject;
                String str3 = str;
                if (TextUtils.isEmpty(str3)) {
                    Log.d("UserMessagingPlatform", "Error on action: empty action name");
                    return;
                }
                String str4 = str2;
                final String lowerCase = str3.toLowerCase();
                if (TextUtils.isEmpty(str4)) {
                    jSONObject = new JSONObject();
                } else {
                    try {
                        jSONObject = new JSONObject(str4);
                    } catch (JSONException unused) {
                        Log.d("UserMessagingPlatform", "Action[" + lowerCase + "]: failed to parse args: " + str4);
                        return;
                    }
                }
                E0[] e0Arr2 = e0Arr;
                Log.d("UserMessagingPlatform", "Action[" + lowerCase + "]: " + jSONObject.toString());
                for (final E0 e02 : e0Arr2) {
                    FutureTask futureTask = new FutureTask(new Callable() { // from class: p3.B
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Boolean.valueOf(e02.a(lowerCase, jSONObject));
                        }
                    });
                    e02.zza().execute(futureTask);
                    try {
                    } catch (InterruptedException e8) {
                        Log.d("UserMessagingPlatform", "Thread interrupted for Action[" + lowerCase + "]: ", e8);
                    } catch (ExecutionException e9) {
                        Log.d("UserMessagingPlatform", "Failed to run Action[" + lowerCase + "]: ", e9.getCause());
                    }
                    if (((Boolean) futureTask.get()).booleanValue()) {
                        return;
                    }
                }
            }
        });
    }
}
