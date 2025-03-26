package e1;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.h;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.util.ArrayList;

/* renamed from: e1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5738c {
    public static void a(g1.b bVar) {
        ArrayList<String> arrayList = new ArrayList();
        Cursor W7 = bVar.W("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (W7.moveToNext()) {
            try {
                arrayList.add(W7.getString(0));
            } catch (Throwable th) {
                W7.close();
                throw th;
            }
        }
        W7.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                bVar.v("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    public static Cursor b(h hVar, g1.e eVar, boolean z7, CancellationSignal cancellationSignal) {
        Cursor q8 = hVar.q(eVar, cancellationSignal);
        if (!z7 || !(q8 instanceof AbstractWindowedCursor)) {
            return q8;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) q8;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? AbstractC5737b.a(abstractWindowedCursor) : q8;
    }

    public static int c(File file) {
        AbstractInterruptibleChannel abstractInterruptibleChannel = null;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            FileChannel channel = new FileInputStream(file).getChannel();
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(allocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            allocate.rewind();
            int i8 = allocate.getInt();
            channel.close();
            return i8;
        } catch (Throwable th) {
            if (0 != 0) {
                abstractInterruptibleChannel.close();
            }
            throw th;
        }
    }
}
