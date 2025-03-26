package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import z0.C7019d;

/* renamed from: androidx.appcompat.widget.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC0863x {

    /* renamed from: androidx.appcompat.widget.x$a */
    private static final class a {
        static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                z0.X.d0(textView, new C7019d.a(dragEvent.getClipData(), 3).a());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }

        static boolean b(DragEvent dragEvent, View view, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            z0.X.d0(view, new C7019d.a(dragEvent.getClipData(), 3).a());
            return true;
        }
    }

    static boolean a(View view, DragEvent dragEvent) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 31 && i8 >= 24 && dragEvent.getLocalState() == null && z0.X.C(view) != null) {
            Activity c8 = c(view);
            if (c8 == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + view);
                return false;
            }
            if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            }
            if (dragEvent.getAction() == 3) {
                return view instanceof TextView ? a.a(dragEvent, (TextView) view, c8) : a.b(dragEvent, view, c8);
            }
        }
        return false;
    }

    static boolean b(TextView textView, int i8) {
        if (Build.VERSION.SDK_INT >= 31 || z0.X.C(textView) == null || !(i8 == 16908322 || i8 == 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            z0.X.d0(textView, new C7019d.a(primaryClip, 1).c(i8 != 16908322 ? 1 : 0).a());
        }
        return true;
    }

    static Activity c(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
