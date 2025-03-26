package R0;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;

/* loaded from: classes.dex */
public abstract class a extends BroadcastReceiver {

    /* renamed from: o, reason: collision with root package name */
    private static final SparseArray f4747o = new SparseArray();

    /* renamed from: s, reason: collision with root package name */
    private static int f4748s = 1;

    public static boolean b(Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        SparseArray sparseArray = f4747o;
        synchronized (sparseArray) {
            try {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray.remove(intExtra);
                    return true;
                }
                Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ComponentName c(Context context, Intent intent) {
        SparseArray sparseArray = f4747o;
        synchronized (sparseArray) {
            try {
                int i8 = f4748s;
                int i9 = i8 + 1;
                f4748s = i9;
                if (i9 <= 0) {
                    f4748s = 1;
                }
                intent.putExtra("androidx.contentpager.content.wakelockid", i8);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
                newWakeLock.setReferenceCounted(false);
                newWakeLock.acquire(60000L);
                sparseArray.put(i8, newWakeLock);
                return startService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
