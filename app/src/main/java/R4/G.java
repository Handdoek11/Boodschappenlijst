package R4;

import J6.AbstractC0650j;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Messenger;
import android.os.Process;
import android.util.Log;
import com.google.firebase.sessions.SessionLifecycleService;
import x6.C6916E;

/* loaded from: classes2.dex */
public final class G implements F {

    /* renamed from: b, reason: collision with root package name */
    private static final a f4805b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.f f4806a;

    private static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    public G(com.google.firebase.f fVar) {
        J6.r.e(fVar, "firebaseApp");
        this.f4806a = fVar;
    }

    private final Object b(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
            return C6916E.f44463a;
        } catch (IllegalArgumentException e8) {
            return Integer.valueOf(Log.w("LifecycleServiceBinder", "Session lifecycle service binding failed.", e8));
        }
    }

    @Override // R4.F
    public void a(Messenger messenger, ServiceConnection serviceConnection) {
        boolean z7;
        J6.r.e(messenger, "callback");
        J6.r.e(serviceConnection, "serviceConnection");
        Context applicationContext = this.f4806a.k().getApplicationContext();
        J6.r.d(applicationContext, "firebaseApp.applicationContext.applicationContext");
        Intent intent = new Intent(applicationContext, (Class<?>) SessionLifecycleService.class);
        Log.d("LifecycleServiceBinder", "Binding service to application.");
        intent.setAction(String.valueOf(Process.myPid()));
        intent.putExtra("ClientCallbackMessenger", messenger);
        intent.setPackage(applicationContext.getPackageName());
        try {
            z7 = applicationContext.bindService(intent, serviceConnection, 65);
        } catch (SecurityException e8) {
            Log.w("LifecycleServiceBinder", "Failed to bind session lifecycle service to application.", e8);
            z7 = false;
        }
        if (z7) {
            return;
        }
        b(applicationContext, serviceConnection);
        Log.i("LifecycleServiceBinder", "Session lifecycle service binding failed.");
    }
}
