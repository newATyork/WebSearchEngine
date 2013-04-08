package edu.nyu.cs.cs2580;

import java.util.Vector;
import java.util.HashMap;
import java.io.Serializable;
import java.util.HashMap;

/**
 * @CS2580: implement this class for HW2 to incorporate any additional
 *          information needed for your favorite ranker.
 */
public class DocumentIndexed extends Document {
  private static final long serialVersionUID = 9184892508124423115L;
  
  private Indexer _indexer = null;

  private  HashMap<String, Integer> docTermFrequency = new HashMap<String, Integer>();

  private long docTotalTermFrequency = 0;
  
  public DocumentIndexed(int docid, Indexer indexer) {
    super(docid);
      _indexer = indexer;
  }

	
	/**
	 * @return the docTotalTermFrequency
	 */
	public long getDocTotalTermFrequency() {
		return docTotalTermFrequency;
	}


	/**
	 * @param docTotalTermFrequency the docTotalTermFrequency to set
	 */
	public void setDocTotalTermFrequency(long docTotalTermFrequency) {
		this.docTotalTermFrequency = docTotalTermFrequency;
	}


	/**
	 * @return the docTermFrequency
	 */
	public HashMap<String, Integer> getDocTermFrequency() {
		return docTermFrequency;
	}

	/**
	 * @param docTermFrequency the docTermFrequency to set
	 */
	public void setDocTermFrequency(HashMap<String, Integer> docTermFrequency) {
		this.docTermFrequency = docTermFrequency;
	}
	

  public String asString(){
	  return Integer.toString(_docid) + "\t" + getTitle() + "\t" + getUrl() + "\n";
  }


}